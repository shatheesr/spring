package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.demo.database.customer;


@Repository
public interface customerrepository extends JpaRepository<customer,Integer> {

}
