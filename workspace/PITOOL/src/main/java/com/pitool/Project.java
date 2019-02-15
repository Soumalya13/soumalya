package com.pitool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(Project.class);
		springApplication.run(args);
	}

}
