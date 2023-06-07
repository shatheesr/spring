package com.hotel.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class loginController {
	@Autowired
	loginserver lserver;
	@GetMapping("/loget")
	public List<logindata> getup(){
		List<logindata> q = lserver.getAll();
		return q;
	}
	
	@PostMapping("/lopost")
	public logindata savevalues(@RequestBody logindata r) {
		return lserver.savevalues(r);
	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = lserver.loginCheckData(username, password);
		return result;
	}
	@PutMapping("/put")
	public logindata updateRecords (@RequestBody logindata s) {
		return lserver.updateRecords(s);

}
