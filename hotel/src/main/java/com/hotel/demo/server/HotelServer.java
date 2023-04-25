package com.hotel.demo.server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.demo.database.hotelmanagement;
import com.hotel.demo.repository.HotelRepository;

@Service
public class HotelServer {
	@Autowired
	HotelRepository dserv;
	public List<hotelmanagement> getAll(){
		List<hotelmanagement>p =dserv.findAll();
		return p;
	}
	public hotelmanagement savevalues(hotelmanagement r) {
		
		return dserv.save(r);
	}
	public hotelmanagement updateRecords(hotelmanagement s) {
		
		 return dserv.save(s);
	}
	public void deleteRecords() {
		dserv.deleteAll();
		
	}
	public void deleteRecords(int num) {
		dserv.deleteById(num);
		
	}

}
