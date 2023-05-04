package com.hotel.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotel.demo.database.hotelmanagement;
@Repository
public interface HotelRepository extends JpaRepository<hotelmanagement,Integer>{
	List<hotelmanagement> findByguestnameStartingWith(String prefix);
	List<hotelmanagement> findByguestnameEndingWith(String suffix);
//	hotelmanagement findByusername(String username);
	@Query("select s from hotelmanagement s ")
	List<hotelmanagement> getAllValue();
	//positional parameter,order should match
	@Query("select p from hotelmanagement p where p.roomtype=?1")

    public List<hotelmanagement> gethotelmanagementByroomtype(String roomtype);

	

	//named parameter

	@Query("select p from hotelmanagement p where p.roomtype=:roomtype")
    public List<hotelmanagement> getShotelmanagementByroomtype(String roomtype);

	

	//DML

	@Modifying

	@Query("delete from hotelmanagement p where p.reservationid=?1")

	public int deletehotelmanagementByroomtype(int reservationid);

	

	@Modifying

	@Query("update hotelmanagement p set p.roomtype=?1 where p.reservationid=?2")

	public int updatehotelmanagementByDetail(String roomtype,int reservationid);

	

	@Query(value="select * from hotelmanagement p ",nativeQuery=true)

	public List<hotelmanagement> fetchhotelmanagementByAll();

}
