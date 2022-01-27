package com.citius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citius.config.TokenManager;
import com.citius.models.AuthUser;
import com.citius.models.JwtResponse;
import com.citius.models.UserModel;
import com.citius.services.CustomUserDetailsService;

@RestController
@CrossOrigin
public class ApiGatewayController {

	@Autowired
	private CustomUserDetailsService customDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private TokenManager tokenManager;

	@GetMapping(value = "/")
	public String home() {
		return "Message from API-Gateway!!";
	}

	@PostMapping("/login")
	public ResponseEntity<?> createToken(@RequestBody AuthUser request) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
		final UserDetails userDetails = customDetailsService.loadUserByUsername(request.getUsername());
		final String jwtToken = tokenManager.generateJwtToken(userDetails);
		return ResponseEntity.ok(new JwtResponse(jwtToken));
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody UserModel user){
		HttpStatus status= customDetailsService.registerUser(user);		
		return new ResponseEntity<HttpStatus>(status); 
		
	}

}
