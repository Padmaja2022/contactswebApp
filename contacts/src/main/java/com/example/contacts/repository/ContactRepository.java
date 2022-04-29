package com.example.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
