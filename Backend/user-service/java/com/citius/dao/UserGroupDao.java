package com.citius.dao;

import java.util.List;

import com.citius.models.UserGroup;

public interface UserGroupDao{

	String addUserGroup(UserGroup userGroup);
	List<UserGroup> getAllUserGroup();
}
