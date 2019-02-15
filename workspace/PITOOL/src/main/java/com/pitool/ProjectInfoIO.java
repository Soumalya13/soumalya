package com.pitool;


import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

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
	private List<ComponentIO> components;
	
	public ProjectInfoIO(String name, String details, String manager, String sa, String si, String sd) {
		super();
		this.name = name;
		this.details = details;
		this.manager = manager;
		this.sa = sa;
		this.si = si;
		this.sd = sd;
	}
	
	public ProjectInfoIO() {}
	
	@XmlElementWrapper
	@XmlElement(name = "component")
	public List<ComponentIO> getComponents() {
		return components;
	}

	public void setComponents(List<ComponentIO> components) {
		this.components = components;
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
	
	@XmlElement(name= "SA")
	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}
	
	@XmlElement(name= "SI")
	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	@XmlElement(name= "SD")
	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}
	
}

