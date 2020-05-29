package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	
	@GetMapping("/createusers")
	public String createUsers()
	{
		return "Users have been created!!";
	}

}
