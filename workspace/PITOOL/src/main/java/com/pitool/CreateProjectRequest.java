package com.pitool;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CreateProjectRequest",namespace="http://com.pitool.projectInfo")
public class CreateProjectRequest {
	
	private ProjectInfoIO projectInfo;
	
	public ProjectInfoIO getProjectInfo() {
		return projectInfo;
	}
	
	public void setProjectInfo(ProjectInfoIO projectInfo) {
		this.projectInfo = projectInfo;
	}
	
}
