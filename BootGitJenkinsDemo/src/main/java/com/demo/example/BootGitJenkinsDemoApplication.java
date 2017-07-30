package com.demo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.demo.controller")
@SpringBootApplication
public class BootGitJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGitJenkinsDemoApplication.class, args);
	}
	
	
}
