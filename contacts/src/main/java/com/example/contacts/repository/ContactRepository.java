package com.example.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.contacts.model.Contact;
@CrossOrigin ("http://localhost:5500")
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
