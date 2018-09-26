package com.toto.details.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
@Access(AccessType.FIELD)
public class Vehicle  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5039246660502733193L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name="REG_NO")
	private String regNo;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="PURCHASE_DATE")
	private String purchaseDate;

	@Column(name="PHOTOS")
	private String photos;

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
	 * @return the regNo
	 */
	public String getRegNo() {
		return regNo;
	}

	/**
	 * @param regNo the regNo to set
	 */
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the purchaseDate
	 */
	public String getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the photos
	 */
	public String getPhotos() {
		return photos;
	}

	/**
	 * @param photos the photos to set
	 */
	public void setPhotos(String photos) {
		this.photos = photos;
	}
	
	
	
}
