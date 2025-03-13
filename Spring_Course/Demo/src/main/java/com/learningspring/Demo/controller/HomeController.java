package com.learningspring.Demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${server.port}")
	private int Port;
	
	@RequestMapping("/")
		public String index(){
		System.out.println("PortNAme "+ Port);
		return "index.html";		
	}	
	
	@GetMapping("/helloword")
	public String helloWorld() {
		return "Hello World";
	}
}
