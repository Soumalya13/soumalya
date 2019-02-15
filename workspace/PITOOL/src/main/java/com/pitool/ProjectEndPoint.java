package com.pitool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pitool.service.ProjectService;


@Endpoint
public class ProjectEndPoint {

	@Autowired
	private ProjectService projectService;   
	
	@ResponsePayload
	@PayloadRoot(namespace="http://com.pitool.projectInfo", localPart = "CreateProjectRequest")
	public CreateProjectResponse createProject(@RequestPayload CreateProjectRequest createProjectRequest) {
		CreateProjectResponse createProjectResponse = new CreateProjectResponse();
		createProjectResponse.setProjectInfo(projectService.createProject(createProjectRequest.getProjectInfo()));
		return createProjectResponse;
		
		
	}
	
	
}
