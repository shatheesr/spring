package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.database.DataBase;
import com.example.demo.server.demosever;

@RestController
public class WelcomeDemoController {
	@Autowired
	demosever dsever;
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
	@GetMapping("/get")
	public List<DataBase> getall(){
		List<DataBase> db = dsever.getAll();
		return db;
	}

}