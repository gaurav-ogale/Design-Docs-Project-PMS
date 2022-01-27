//package com.demo.controller;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class securityConfigurer extends WebSecurityConfigurerAdapter {
//	
////	@Autowired
////	private MyUserDetailsService myUserDetails;
////
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth ) throws Exception{
////		auth.userDetailsService(myUserDetails);
////		
////	}
////	
////	@Override
////	protected void configure(HttpSecurity http ) throws Exception{
////		http.csrf().disable()
////					.authorizeRequests().antMatchers("/authenticate").permitAll().
////					anyRequest().authenticated();
////	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//}
