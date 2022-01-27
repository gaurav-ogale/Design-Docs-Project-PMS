package com.citius.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.citius.services.CustomUserDetailsService;
import com.citius.utilities.JwtAuthenticationEntryPoint;

@Configuration

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Autowired
	private JwtFilter filter;

	@Autowired
	private JwtAuthenticationEntryPoint authenticationEntryPoint;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		//return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/login", "/register").permitAll().anyRequest().authenticated().and()
				.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
	}


}
