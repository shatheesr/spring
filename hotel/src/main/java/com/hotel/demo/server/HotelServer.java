package com.hotel.demo.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.demo.database.hotelmanagement;
import com.hotel.demo.repository.HotelRepository;

import jakarta.transaction.Transactional;

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
		
		return dserv.findAll(Sort.by(field).descending());
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
	public List<hotelmanagement> getAllValue() {
		return dserv.getAllValue();
	}
	public List<hotelmanagement> gethotelmanagementByroomtype(String roomtype) {
		return dserv.gethotelmanagementByroomtype(roomtype);
	}
	public List<hotelmanagement> getShotelmanagementByroomtype(String roomtype) {
		return dserv.getShotelmanagementByroomtype(roomtype);
	}
	@Transactional
	public int deletehotelmanagementByroomtype( int reservationid) {
		return dserv.deletehotelmanagementByroomtype(reservationid);
	}
	@Transactional
	public int updatehotelmanagementByDetail(String roomtype, int reservationid) {
		return dserv.updatehotelmanagementByDetail(roomtype,reservationid);
	}
	public List<hotelmanagement> fetchhotelmanagementByAll(){
		return dserv.fetchhotelmanagementByAll();
	}

	

}
