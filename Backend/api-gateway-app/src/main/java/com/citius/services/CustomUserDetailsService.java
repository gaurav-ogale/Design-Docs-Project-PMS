/*
 * package com.citius.services;
 * 
 * import java.util.ArrayList;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestTemplate; import
 * org.springframework.web.reactive.function.client.WebClient;
 * 
 * import com.citius.model.AuthUser;
 * 
 * import reactor.core.publisher.Mono;
 * 
 * @Service public class CustomUserDetailsService implements UserDetailsService
 * {
 * 
 * @Autowired RestTemplate restTemplate;
 * 
 * @Autowired private WebClient.Builder userClient;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException {
 * 
 * // AuthUser authUser = //
 * restTemplate.getForObject("http://USER-SERVICE/api/v1/auth/" + username, //
 * AuthUser.class);
 * 
 * AuthUser authUser =
 * userClient.build().get().uri("http://USER-SERVICE/api/v1/auth/" + username)
 * .retrieve().bodyToMono(AuthUser.class).block(); if
 * (!authUser.getUsername().isEmpty()) { return new User(authUser.getUsername(),
 * authUser.getPassword(), new ArrayList<>()); } else throw new
 * UsernameNotFoundException("User Not Found! Please Register Yourself");
 * 
 * }
 * 
 * }
 */