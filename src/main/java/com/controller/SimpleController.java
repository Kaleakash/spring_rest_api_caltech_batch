package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ec2")
public class SimpleController {
	
	// default port number 8080
	// http://localhost:8080/ec2/greeting/akash
	// http://54.211.20.25:8080/ec2/greeting/akash
	
	@GetMapping(value = "/greeting/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to Spring boot with EC2 instance user done with Docker and Jenkine Pipeline "+name;
	}
}
