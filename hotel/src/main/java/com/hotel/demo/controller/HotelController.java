package com.hotel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.database.hotelmanagement;
import com.hotel.demo.server.HotelServer;
@RestController
public class HotelController {
	@Autowired
	HotelServer dbask;
	@GetMapping("/get")
	public List<hotelmanagement> getup(){
		List<hotelmanagement> q = dbask.getAll();
		return q;
	}
	@PostMapping("/post")
	public hotelmanagement savevalues(@RequestBody hotelmanagement r) {
		return dbask.savevalues(r);
	}
	@PutMapping("/put")
	public hotelmanagement updateRecords (@RequestBody hotelmanagement s) {
		return dbask.updateRecords(s);
		
	}
	@DeleteMapping("/delete")
	public void deleteRecords() {
		dbask.deleteRecords();
	}
	@DeleteMapping("/delete/{num}")
	public void deleteRecords(@PathVariable("num") int num) {
		dbask.deleteRecords(num);
	}

}
