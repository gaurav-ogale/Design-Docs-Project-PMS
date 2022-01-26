package com.citius.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citius.dao.UserDao;
import com.citius.models.AuthUser;
import com.citius.models.User;
import com.citius.models.UserGroup;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(User user) {
		UserGroup userGroup = user.getUserGroup();
		userGroup.setUser(Arrays.asList(user));
		user.setUserGroup(userGroup);
		return userDao.addUser(user);
	}

	@Override
	public AuthUser authenticateUser(String username) throws Exception {
		// TODO Auto-generated method stub
		return userDao.authenticateUser(username);
	}

}
