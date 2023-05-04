package com.hotel.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.demo.database.customer;
import com.hotel.demo.server.customerAndCustomerAddressService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class customerAndCustomerAddressController {
	  @Autowired
	  customerAndCustomerAddressService customerService;
      @GetMapping("/getAllCustomer")
      public List<customer> fetchAllCustomer()
      {
    return customerService.fetchAllCustomer();
      }
      
      @PostMapping("/saveAlldata")
      public customer saveCustomer(@RequestBody customer c)
      {
     return customerService.saveCustomer(c);
      }

}
