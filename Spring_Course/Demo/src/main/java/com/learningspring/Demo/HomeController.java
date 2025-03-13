package com.learningspring.Demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@Value("${server.port}")
	private int Port;
	
	@RequestMapping("/")
		public String index(){
		System.out.println("PortNAme "+ Port);
		return "index.html";
		
	}	
}
