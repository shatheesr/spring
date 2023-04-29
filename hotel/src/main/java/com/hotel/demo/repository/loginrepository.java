package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.demo.database.logindata;

public interface loginrepository extends JpaRepository<logindata,Integer>{
	logindata findByusername(String username);

}
