package com.wyb.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/test")
public class TestController {

	@ResponseBody
	@RequestMapping("/abc")
	public String test(){
		return "test page!";
	}
	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("=======hello=======");
		return "test/hello";
	}

}
