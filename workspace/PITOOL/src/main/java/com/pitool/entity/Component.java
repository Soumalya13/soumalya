package com.pitool.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Access(javax.persistence.AccessType.FIELD)
@Table(name="COMPONENTS")
public class Component implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8324160048790516537L;
	@Id
	@Column(name="Component_ID")
	private  Integer componentID;
	
	@Column(name="Name")
	private String name  ;
	
	@Column(name="Details")
	private String details;
	
	@ManyToOne
	@JoinColumn(name = "Project_id" , referencedColumnName = "Project_id")
	private ProjectInfo projectInfo;
	

	public Component(String name, String details) {
		super();
		this.name = name;
		this.details = details;
	}
	
	public Component() {}
	
	public ProjectInfo getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}
	
	public Integer getComponentID() {
		return componentID;
	}
	
	public void setComponentID(Integer componentID) {
		this.componentID = componentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	
}

