package com.pitool;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CreateProjectResponse",namespace="http://com.pitool.projectInfo")
public class CreateProjectResponse {
	
	private ProjectInfoIO projectInfo;

	public ProjectInfoIO getProjectInfo() {
		return projectInfo;
	}
	
	public void setProjectInfo(ProjectInfoIO projectInfo) {
		this.projectInfo = projectInfo;
	}


}

