package com.hotel.demo.server;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.demo.database.customer;
import com.hotel.demo.repository.customerrepository;



@Service
public class customerAndCustomerAddressService {
	@Autowired
	customerrepository customRep;

	public List<customer> fetchAllCustomer()
	{
	return customRep.findAll();
	}

	public customer saveCustomer(customer c)
	{

	return customRep.save(c);
	}


}
