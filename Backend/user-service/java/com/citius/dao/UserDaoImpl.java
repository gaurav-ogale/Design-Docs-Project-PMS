package com.citius.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citius.models.AuthUser;
import com.citius.models.User;
import com.citius.models.UserGroup;
import com.citius.repository.UsersRepository;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private UsersRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<>();
		userList = userRepository.findAll();
		userList = dbToJson(userList);
		return userList;
	}

	private List<User> dbToJson(List<User> userList) {
		List<User> jsonList = new ArrayList<>();
		for (User user : userList) {
			User returnUser = new User();
			UserGroup userGroup = new UserGroup();
			returnUser.setUserID(user.getUserID());
			returnUser.setPassword(user.getPassword());
			returnUser.setUserContactNo(user.getUserContactNo());
			returnUser.setUserDOB(user.getUserDOB());
			userGroup.setUserGroupId(user.getUserGroup().getUserGroupId());
			userGroup.setUserRole(user.getUserGroup().getUserRole());
			returnUser.setUserGroup(userGroup);
			returnUser.setUserEmail(user.getUserEmail());
			returnUser.setUserFirstName(user.getUserFirstName());
			jsonList.add(returnUser);

		}

		return jsonList;

	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(User user) {
		User user1 = userRepository.save(user);
		if (user1.getUserID() != null)
			return "success";
		return "failed";
	}

	@Override
	public AuthUser authenticateUser(String username) throws Exception {
		User user = userRepository.getUserWithEmail(username);
		if(user !=null) {
			AuthUser authUser = new AuthUser();
			authUser.setUsername(user.getUserEmail());
			authUser.setPassword(user.getPassword());
			return authUser;
		}else {
			throw new Exception("User Not found");
		}


	}

}
