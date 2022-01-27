/*
 * package com.citius.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * import com.citius.services.CustomUserDetailsService;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class MySecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Autowired CustomUserDetailsService customUserDetailsService;
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.userDetailsService(customUserDetailsService).passwordEncoder(
 * passwordEncoder()); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { //
 * TODO Auto-generated method stub super.configure(http); }
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * }
 */