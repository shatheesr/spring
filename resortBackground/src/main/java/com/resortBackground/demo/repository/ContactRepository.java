package com.resortBackground.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resortBackground.demo.Model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>  {

}
