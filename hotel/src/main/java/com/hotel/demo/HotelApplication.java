package com.hotel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(

		title="HOTEL",

		version="1.1.2",

		description="HOTEL",

		contact=@Contact(name="Shathees R",email="727821tuec218@skct.edu.in")))
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
		System.out.print("Shathees");
	}

}
