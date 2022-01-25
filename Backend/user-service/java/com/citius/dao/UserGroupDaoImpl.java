package com.citius.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.citius.models.UserGroup;
import com.citius.repository.UserGroupRepository;

@Component
public class UserGroupDaoImpl implements UserGroupDao{

	@Autowired
	UserGroupRepository userGroupRepository;
	
	@Override
	public String addUserGroup(UserGroup userGroup) {
		// TODO Auto-generated method stub
		UserGroup user = userGroupRepository.save(userGroup);		
		if(user.getUserGroupId()!=null)
			return "success";
		return "failed";
	}
	
	@Override
	public List<UserGroup> getAllUserGroup() {
		// TODO Auto-generated method stub
		List<UserGroup> userGroupList = new ArrayList<>();		
		userGroupList=userGroupRepository.findAll();		
		return userGroupList;
	}

}
