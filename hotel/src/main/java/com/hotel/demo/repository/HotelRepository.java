package com.hotel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hotel.demo.database.hotelmanagement;
public interface HotelRepository extends JpaRepository<hotelmanagement,Integer>{

}
