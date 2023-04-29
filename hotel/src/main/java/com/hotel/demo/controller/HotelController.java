package com.hotel.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;
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
	@GetMapping("/get/{id}")
	public Optional<hotelmanagement> readbyid(@PathVariable int id){
		Optional<hotelmanagement> q = dbask.getbyid(id);
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
	public String deleteRecords() {
		dbask.deleteRecords();
		return "all records was deleted";
	}
	@DeleteMapping("/delete/{num}")
	public String deleteRecords(@PathVariable("num") int num) {
		dbask.deleteRecords(num);
		return "Reservation_ID "+num+" was deleted";
		
	}
	//sorting
	@GetMapping("/sort/{field}")
	public List<hotelmanagement>sortHotel(@PathVariable("field") String field){
		return dbask.sortAll(field);
	}
	
	//paging
	@GetMapping("/get/{offset}/{pagesize}")
	public List<hotelmanagement> paging(@PathVariable int offset,@PathVariable int pagesize){
		return dbask.paging(offset,pagesize);
	}
	//paging and sorting
	@GetMapping("/get/{offset}/{pagesize}/{field}")
	public List<hotelmanagement> paging(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return dbask.pagingAndSorting(offset,pagesize,field);
	}
	@GetMapping("/get/fetchguestnamebyprefix")
	public List<hotelmanagement> fetchguestnamebyprefix(@RequestParam String prefix){
		return dbask.fetchguestnamebyprefix(prefix);
	}
	@GetMapping("/get/fetchguestnamebysuffix")
	public List<hotelmanagement> fetchguestnamebysuffix(@RequestParam String suffix){
		return dbask.fetchguestnamebysuffix(suffix);
	}


}
