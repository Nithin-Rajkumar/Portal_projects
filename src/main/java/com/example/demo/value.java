package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value("${name.value}")
	
	private String testvalue;
	
	@GetMapping("/value")
	public String getName() {
		return "Welcome to this "+testvalue;
	}
}
