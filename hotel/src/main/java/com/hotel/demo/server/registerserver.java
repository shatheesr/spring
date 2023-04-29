package com.hotel.demo.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.demo.database.registerdata;
import com.hotel.demo.repository.registerrepo;

@Service
public class registerserver {
	@Autowired
	registerrepo rrepo;
	public List<registerdata> getAll(){
		return rrepo.findAll();
	}
	
	
	public registerdata savevalues(registerdata r) {
		
		return rrepo.save(r);                   
	}

}
