package com.citius.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.citius.models.AuthUser;
import com.citius.models.User;
import com.citius.models.UserGroup;
import com.citius.services.UserGroupService;
import com.citius.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserGroupService userGroupService;

	@GetMapping("/auth/{username}")
	public AuthUser authenticateUser(@PathVariable String username) {
		try {
			return userService.authenticateUser(username);
		} catch (Exception e) {
			return new AuthUser(null,null);
		}
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		System.out.println("Inside Get Users");
		return userService.getAllUsers();
	}

	@PostMapping("/user")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		String res = userService.addUser(user);
		if (res.equalsIgnoreCase("success"))
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	@PostMapping("/usergroup")
	public ResponseEntity<?> addUserGroup(@RequestBody UserGroup userGroup){
		String res = userGroupService.addUserGroup(userGroup);
		if (res.equalsIgnoreCase("success"))
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@GetMapping("/usergroup")
	public List<UserGroup> getAllUserGroups(){
		return userGroupService.getAllUserGroup();
	}

}
