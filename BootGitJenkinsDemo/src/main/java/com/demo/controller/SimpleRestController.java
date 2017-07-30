package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	@RequestMapping("/sayHello")
	public String sayHello()
	{
		System.out.println("Coming to Controller");
		return "Hello and welcome to boot";
	}

}
