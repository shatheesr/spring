package com.resortBackground.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resortBackground.demo.Model.Contact;
import com.resortBackground.demo.repository.ContactRepository;

@Service
public class ContactService {

	private final ContactRepository contactRepository;
	
	@Autowired
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}
}


