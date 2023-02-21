package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name {
	
	private String name="IamNeo";
	@GetMapping("/check")
	
	public String getame() {
		return "Welcome "+name;
	}
}
