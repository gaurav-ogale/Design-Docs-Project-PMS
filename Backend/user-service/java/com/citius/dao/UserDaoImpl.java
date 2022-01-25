package com.citius.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citius.models.User;
import com.citius.repository.UsersRepository;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	UsersRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userList=userRepository.findAll();
		return userList;
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(User user) {
		User user1 = userRepository.save(user);
		if(user1.getUserID()!=null)
			return "success";
		return "failed";
	}

}
