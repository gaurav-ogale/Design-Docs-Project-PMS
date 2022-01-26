package com.citius.services;

import java.util.List;

import com.citius.models.UserGroup;

public interface UserGroupService {
	
	String addUserGroup(UserGroup userGroup);
	
	List<UserGroup> getAllUserGroup();
	


}
