package com.pitool;

import java.io.Serializable;

public class ComponentIO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8324160048790516537L;
	private String name  ;
	private String details;
	
	
	public ComponentIO(String name, String details) {
		super();
		this.name = name;
		this.details = details;
	}
	
	public ComponentIO() {}

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

