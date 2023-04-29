package com.hotel.demo.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hotel.demo.database.hotelmanagement;
import com.hotel.demo.repository.HotelRepository;

@Service
public class HotelServer {
	@Autowired
	HotelRepository dserv;
	public List<hotelmanagement> getAll(){
		return dserv.findAll();
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


	public Optional<hotelmanagement> getbyid(int id) {
		Optional<hotelmanagement>p =dserv.findById(id);
		return p;
	}
//sorting
	public List<hotelmanagement> sortAll(String field) {
		
		return dserv.findAll(Sort.by(field));
	}


	public List<hotelmanagement> paging(int offset, int pagesize) {
		Pageable paging =PageRequest.of(offset, pagesize);
		Page<hotelmanagement>hm = dserv.findAll(paging);
		return hm.getContent();
	}


	public List<hotelmanagement> pagingAndSorting(int offset, int pagesize, String field) {
		Pageable paging =PageRequest.of(offset, pagesize).withSort(Sort.by(field));
		Page<hotelmanagement>hm = dserv.findAll(paging);
		return hm.getContent();
	}


	public List<hotelmanagement> fetchguestnamebyprefix(String prefix) {
		return dserv.findByguestnameStartingWith(prefix);
	}

	public List<hotelmanagement> fetchguestnamebysuffix(String suffix) {
		return dserv.findByguestnameEndingWith(suffix);
	}
	
	

	

}
