package com.nv.deployment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "<h1> Welcome to the niles Deployment Project </h1>";
	}
}
