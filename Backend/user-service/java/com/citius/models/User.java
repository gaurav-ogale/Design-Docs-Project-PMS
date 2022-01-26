package com.citius.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "user_Id")
	private Long userID;
	private String userTitle;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userDOB;
	private String userContactNo;
	private String password;
//	@ManyToOne(cascade=CascadeType.PERSIST)
//	@JoinColumn(name="user_group_id" , nullable = false)
//	private UserGroup userGroup;
	
//	@OneToMany(mappedBy = "user" , cascade = CascadeType.PERSIST)
//	private List<UserGroup> userGroups;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userGroupId")
	private UserGroup userGroup;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}

	public String getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserGroup getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}



	
	
	

}
