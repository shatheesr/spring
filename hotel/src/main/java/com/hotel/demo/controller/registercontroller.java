package com.hotel.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.database.registerdata;
import com.hotel.demo.server.registerserver;

@RestController
public class registercontroller {
	@Autowired
	registerserver rs;
	@GetMapping("/rget")
	public List<registerdata> getal(){
		List<registerdata> q = rs.getAll();
		return q;
	}
	
	@PostMapping("/rpost")
	public registerdata savevalue(@RequestBody registerdata r) {
		return rs.savevalues(r);
	}

}
