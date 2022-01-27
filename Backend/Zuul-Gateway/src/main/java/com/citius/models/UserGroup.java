package com.citius.models;

import java.util.List;

public class UserGroup {

	private Long userGroupId;

	private String userRole;

	private List<UserModel> user;

	public Long getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(Long userGroupId) {
		this.userGroupId = userGroupId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public List<UserModel> getUser() {
		return user;
	}

	public void setUser(List<UserModel> user) {
		this.user = user;
	}

}
