package com.wyb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String greeting(){
		return "hello world!";
	}
		
	public static void main(String[]args){
		SpringApplication.run(Application.class, args);
	}
	
	
}
