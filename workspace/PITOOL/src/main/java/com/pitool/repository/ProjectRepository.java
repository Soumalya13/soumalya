package com.pitool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pitool.entity.ProjectInfo;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectInfo, String>{

}
