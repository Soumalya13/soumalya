package com.toto.details.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.toto.details.entity.User;



@RestController
public class ServiceController {
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public @ResponseBody User registration() {
		
		User user = new User();
		user.setEmailId("jii@google.com");
		user.setMobile(123456);
		user.setAddress("KOLKATA");
		user.setLandmark("KOLKATA");
		user.setName("TOTO RIDE");
		user.setPassword("1234");
		user.setRegistrationNo("S8RT56");
		user.setUserType("TOTO");
		return user;
	}
	

}
