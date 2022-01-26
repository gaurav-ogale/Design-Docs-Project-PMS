package com.citius.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.citius.models.AuthUser;
import com.citius.models.User;

@Service
public interface UserService {

	List<User> getAllUsers();
	User getUser(User user);	
	String addUser(User user);
	AuthUser authenticateUser(String username) throws Exception;
}
