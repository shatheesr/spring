package com.hotel.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.demo.database.hotelmanagement;
@Repository
public interface HotelRepository extends JpaRepository<hotelmanagement,Integer>{
//	List<hotelmanagement> findByguestnameStartingWith(String prefix);
//	List<hotelmanagement> findByguestnameEndingWith(String suffix);
//	hotelmanagement findByusername(String username);

}
