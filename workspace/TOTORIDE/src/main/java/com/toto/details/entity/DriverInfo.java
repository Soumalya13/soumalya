package com.toto.details.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "DRIVER_INFO")
@DiscriminatorValue("DRIVER")
public class DriverInfo extends Info implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8434867088095880653L;

	@Column(name="PHOTO")
	private String photo; 
	
	@Column(name="ADDRESS_IMAGES")
	private String addressImages; 
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="LICENCE")
	private String licence;

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the addressImages
	 */
	public String getAddressImages() {
		return addressImages;
	}

	/**
	 * @param addressImages the addressImages to set
	 */
	public void setAddressImages(String addressImages) {
		this.addressImages = addressImages;
	}

	/**
	 * @return the licence
	 */
	public String getLicence() {
		return licence;
	}

	/**
	 * @param licence the licence to set
	 */
	public void setLicence(String licence) {
		this.licence = licence;
	} 
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
