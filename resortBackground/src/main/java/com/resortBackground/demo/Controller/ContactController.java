package com.resortBackground.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resortBackground.demo.Model.Contact;
import com.resortBackground.demo.Service.ContactService;

@RestController
@CrossOrigin
@RequestMapping("/book")
public class ContactController {

	private final ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@PostMapping("/in")
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
		Contact createdContact = contactService.saveContact(contact);
		return new ResponseEntity<>(createdContact, HttpStatus.CREATED);
	}
}

