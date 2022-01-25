package com.citius.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userGroup")
public class UserGroup{

	@Id
	@GeneratedValue
	@Column(name = "userGroupId")
	private Long userGroupId;
	@Column(unique=true)
	private String userRole;
	
	@OneToOne(targetEntity = User.class)
	private User user;

	public UserGroup() {
		// TODO Auto-generated constructor stub
	}

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

	public UserGroup(Long userGroupId, String userRole) {
		super();
		this.userGroupId = userGroupId;
		this.userRole = userRole;
	}


}
