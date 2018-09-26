package com.toto.details.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "PASSENGER_INFO")
@DiscriminatorValue("PASSENGER")
public class PassengerInfo extends Info implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7338874904775351419L;
	
	@Column(name="DEVICE_ID")
	private String deviceId;
	
	@Column(name="ADDRESS")
	private String address;

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	} 
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
