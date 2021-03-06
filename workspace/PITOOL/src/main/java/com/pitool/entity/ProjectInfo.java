package com.pitool.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Access(javax.persistence.AccessType.FIELD)
@Table(name="PROJECT")
public class ProjectInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7882104743796066740L;

	@Id
	@Column(name="Project_id")
	private  Integer projectID;
	
	@Column(name="Name")
	private String name  ;
	
	@Column(name="Details")
	private String details;

	@Column(name="Manager")
	private String manager;
	
	@Column(name="SA")
	private String sa;
	
	@Column(name="SI")
	private String si;

	@Column(name="SD")
	private String sd;

	@OneToMany(cascade= CascadeType.ALL , mappedBy = "projectInfo")
	private List<Component> components;
	
	
	public ProjectInfo(String name, String details, String manager, String sa, String si, String sd) {
		super();
		this.name = name;
		this.details = details;
		this.manager = manager;
		this.sa = sa;
		this.si = si;
		this.sd = sd;
	}
	
	public ProjectInfo() {}
	
	public List<Component> getComponents() {
		return components;
	}
	
	public Integer getProjectID() {
		return projectID;
	}

	public void setProjectID(Integer projectID) {
		this.projectID = projectID;
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

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}
	
}
