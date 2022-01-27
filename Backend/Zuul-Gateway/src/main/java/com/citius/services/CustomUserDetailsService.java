
package com.citius.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citius.models.AuthUser;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	 AuthUser authUser = restTemplate.getForObject("http://localhost:8082/auth/" + username, AuthUser.class);

		if (!authUser.getUsername().isEmpty()) {
			return new User(authUser.getUsername(), authUser.getPassword(), new ArrayList<>());
		} else
			throw new UsernameNotFoundException("User Not Found! Please Register Yourself");

	}

}
