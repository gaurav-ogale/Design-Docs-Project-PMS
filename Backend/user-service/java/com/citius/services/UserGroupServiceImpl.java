package com.citius.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citius.dao.UserGroupDao;
import com.citius.models.AuthUser;
import com.citius.models.UserGroup;

@Service
public class UserGroupServiceImpl implements UserGroupService{

	@Autowired
	UserGroupDao userGroupDao;
	@Override
	public String addUserGroup(UserGroup userGroup) {
		return userGroupDao.addUserGroup(userGroup);
	}
	@Override
	public List<UserGroup> getAllUserGroup() {
		return userGroupDao.getAllUserGroup();
	}


}
