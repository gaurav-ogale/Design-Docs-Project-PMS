//package com.demo.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloResource {
//	
////	@Autowired
////	private AuthenticationManager authenticationManager;
////	
////	@Autowired
////	private MyUserDetailsService userDetailsService;
////	
////	@Autowired
////	private jwtUtil jwtUtil;
//	
//	@GetMapping("/hello")
//	public String hello() {
//		return "hello world";
//	}
////	
////	@PostMapping("/authenticate")
////	public ResponseEntity<?> createAuthenticationToken
////	(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
////		
////		try{
////			authenticationManager.authenticate(
////				new UsernamePasswordAuthenticationToken
////				(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
////		}
////		catch(BadCredentialsException ex) {
////			throw new Exception("Incorrect username or password" ,ex);
////		}
////		
////		final UserDetails userDetails = 
////				userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
////		
////		final String jwt = jwtUtil.generateToken(userDetails);
////		
////		return ResponseEntity.ok(new AuthenticationResponse(jwt));
////	}
//
//}
