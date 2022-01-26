package com.citius.dao;

import java.util.List;

import com.citius.models.AuthUser;
import com.citius.models.User;

public interface UserDao {

	List<User> getAllUsers();
	User getUser(User user);	
	String addUser(User user);
	AuthUser authenticateUser(String username) throws Exception;
}
