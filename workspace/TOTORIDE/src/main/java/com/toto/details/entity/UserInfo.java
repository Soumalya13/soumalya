package com.toto.details.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;


@DiscriminatorValue("USER")
public class UserInfo extends Info implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9046734406843083238L;
	
	
	
	

}
