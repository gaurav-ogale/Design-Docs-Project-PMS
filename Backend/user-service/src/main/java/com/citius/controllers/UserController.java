package com.citius.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	public List<String> getUsers(){
		return Arrays.asList("Gaurav","Rahul");
	}
	
	@GetMapping("/user")
	public String getSingle() {
		return "hello from users";
	}
}
