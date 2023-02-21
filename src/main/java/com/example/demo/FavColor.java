package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FavColor {
	private String myFavColor="Red";
	@GetMapping("/color")
	
	public String getame() {
		return "My Favorite Color is "+myFavColor;
	}
}
