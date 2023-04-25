package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.DataBase;

@RestController
public class WelcomeDemoController {

	@GetMapping("/signup")
	public String Signup() {
		return "this is signup page";
	}

	@GetMapping("/landingpage")

	public String LandingPage(@RequestParam String username, @RequestParam String password) {
		if (username.equals("nick") && password.equals("12345")) {
			return "login sucessfully as " + username;
		} else {
			return "login failed:Invalid username or password";
		}
	}
	@GetMapping("/getemp")
	public DataBase getEmployee() {
		return new DataBase(101,"Shathees",34000);
	}

}