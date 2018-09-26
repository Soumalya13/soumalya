package com.toto.details;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainTOTORIDE {
	
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MainTOTORIDE.class);
	    app.setBannerMode(Banner.Mode.CONSOLE);
	    app.run(args);
		
	}


}
