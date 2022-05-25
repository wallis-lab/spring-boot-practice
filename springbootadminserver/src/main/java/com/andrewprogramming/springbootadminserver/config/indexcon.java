package com.andrewprogramming.springbootadminserver.config;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexcon {

	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
