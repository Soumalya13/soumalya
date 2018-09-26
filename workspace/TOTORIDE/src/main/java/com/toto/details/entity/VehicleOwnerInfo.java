package com.toto.details.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "VEHICLE_OWNER_INFO")
@DiscriminatorValue("VEHICLE")
public class VehicleOwnerInfo extends Info implements Serializable {
	
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
	
	@Column(name="AADHAAR")
	private String aadhaar;

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
	 * @return the aadhaar
	 */
	public String getAadhaar() {
		return aadhaar;
	}

	/**
	 * @param aadhaar the aadhaar to set
	 */
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
