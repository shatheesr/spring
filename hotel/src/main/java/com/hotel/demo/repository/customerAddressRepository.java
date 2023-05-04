package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.demo.database.CustomerAddress;

@Repository
public interface customerAddressRepository extends JpaRepository<CustomerAddress,Integer> {

}
