package com.citius.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "userData")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	private Long userID;
	private String userTitle;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userDOB;
	private String userContactNo;
	private String password;
	@OneToOne(targetEntity=UserGroup.class,cascade=CascadeType.ALL)
	private UserGroup userGroup;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long userID, String userTitle, String userFirstName, String userLastName, String userEmail,
			String userDOB, String userContactNo, String password, UserGroup userGroup) {
		super();
		this.userID = userID;
		this.userTitle = userTitle;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userDOB = userDOB;
		this.userContactNo = userContactNo;
		this.password = password;
		this.userGroup = userGroup;
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

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userTitle=" + userTitle + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userEmail=" + userEmail + ", userDOB=" + userDOB
				+ ", userContactNo=" + userContactNo + ", password=" + password + ", userGroup=" + userGroup + "]";
	}
	
	

}
