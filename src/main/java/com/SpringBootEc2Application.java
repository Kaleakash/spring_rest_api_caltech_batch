package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEc2Application.class, args);
		System.err.println("spring boot up on port number 8080");
	}

}
