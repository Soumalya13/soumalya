package com.toto.details.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="INFO")
@Access(AccessType.FIELD)
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE")
public abstract class Info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id; 
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SEX")
	private String sex;
	
	@Column(name="REFCODE")
	private String refCode;
	
	@Column(name="MOBILE")
	private Integer mobile;
	
	@Column(name="MOBILE_OTP")
	private String mobileOTP;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="PINCODE")
	private Integer pincode;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="REGISTRATION_DATE")
	private String registrationDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the refCode
	 */
	public String getRefCode() {
		return refCode;
	}

	/**
	 * @param refCode the refCode to set
	 */
	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	/**
	 * @return the mobile
	 */
	public Integer getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the mobileOTP
	 */
	public String getMobileOTP() {
		return mobileOTP;
	}

	/**
	 * @param mobileOTP the mobileOTP to set
	 */
	public void setMobileOTP(String mobileOTP) {
		this.mobileOTP = mobileOTP;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the pincode
	 */
	public Integer getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the registrationDate
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	
}
