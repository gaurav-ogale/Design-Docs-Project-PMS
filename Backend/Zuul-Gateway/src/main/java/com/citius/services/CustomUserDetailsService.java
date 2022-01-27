
package com.citius.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.citius.models.AuthUser;
import com.citius.models.UserModel;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	 AuthUser authUser = restTemplate.getForObject("http://USER-SERVICE/auth/" + username, AuthUser.class);

		if (!authUser.getUsername().isEmpty()) {
			return new User(authUser.getUsername(), authUser.getPassword(), new ArrayList<>());
		} else
			throw new UsernameNotFoundException("User Not Found! Please Register Yourself");

	}
	
	public HttpStatus registerUser(UserModel user) {
		
		if(user != null) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
		}
		
	    HttpHeaders headers=new HttpHeaders();
	    headers.set("Content-Type", "application/json");
	    HttpEntity requestEntity=new HttpEntity(user, headers);
		
		ResponseEntity<?> responseEntity = restTemplate.postForObject("http://USER-SERVIC/user", requestEntity, ResponseEntity.class);

		
		if(responseEntity.getStatusCode() == HttpStatus.CREATED) {
			return HttpStatus.CREATED;
		}
		
		return HttpStatus.INTERNAL_SERVER_ERROR;
		
	}

}
