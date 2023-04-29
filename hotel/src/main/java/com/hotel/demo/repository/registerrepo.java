package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.demo.database.registerdata;


public interface registerrepo extends JpaRepository<registerdata,Integer>{

}
