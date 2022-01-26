package com.citius.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usergroup")
public class UserGroup{

//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="user_group_id")
	private Long userGroupId;
	
	@Column(name ="user_role")
	@Id
	private String userRole;
	
//	@OneToMany(mappedBy = "userGroup", cascade=CascadeType.PERSIST)
//	private List<User> user;
	
//	@ManyToOne( mappedBy = "userGroups",cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "user_Id")
//	private User user;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<User> user;

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

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}




	


}
