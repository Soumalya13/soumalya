package com.pitool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pitool.ProjectInfoIO;
import com.pitool.entity.ProjectInfo;
import com.pitool.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public ProjectInfoIO createProject(ProjectInfoIO projectInfoIO) {
		
		ProjectInfo projectInfo = new ProjectInfo(projectInfoIO.getName() , projectInfoIO.getDetails(), 
				projectInfoIO.getManager(), projectInfoIO.getSa(),null,projectInfoIO.getSd());
		projectInfo = projectRepository.save(projectInfo);
		
		ProjectInfoIO projectInfoIOResponse = new ProjectInfoIO(projectInfo.getName() , projectInfo.getDetails(), 
				projectInfo.getManager(), projectInfo.getSa(),null,projectInfo.getSd());
		
		
		return projectInfoIOResponse;
		
	}
}
