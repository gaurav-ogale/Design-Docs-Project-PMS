package com.citius.models;

public class UserModel {

	private Long userID;
	private String userTitle;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userDOB;
	private String userContactNo;
	private String password;
	private UserGroup userGroup;

	public UserModel() {
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
