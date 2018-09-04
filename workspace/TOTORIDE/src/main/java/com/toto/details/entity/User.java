package com.toto.details.entity;

import java.io.Serializable;
import java.sql.Clob;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9046734406843083238L;
	
	private Integer mobile;
	
	private String name;
	private String address;
	private String landmark;
	private String emailId;
	private String password;
	private String userType;
	private String registrationNo;
	private String dateOfBirth;
	private Clob userImage;
	private Clob totoImage;
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Clob getUserImage() {
		return userImage;
	}
	public void setUserImage(Clob userImage) {
		this.userImage = userImage;
	}
	public Clob getTotoImage() {
		return totoImage;
	}
	public void setTotoImage(Clob totoImage) {
		this.totoImage = totoImage;
	}
	
	
	

}
