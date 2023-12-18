package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiMapping {

	@GetMapping("/")
	public String homePage() {
		return "This is a Home Page Content";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		return "This is About US";
	}
	
}
