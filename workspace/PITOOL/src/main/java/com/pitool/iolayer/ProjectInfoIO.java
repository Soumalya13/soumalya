package com.pitool.iolayer;

import java.io.Serializable;

public class ProjectInfoIO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8324160048790516537L;
	private String name  ;
	private String details;
	private String manager;
	private String sa;
	private String si;
	private String sd;

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

