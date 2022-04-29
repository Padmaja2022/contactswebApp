package com.example.contacts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contacts.repository.ContactRepository;
import com.example.contacts.repository.OrganizationRepository;
import com.example.contacts.repository.PersonRepository;



@Service
public class ContactsService {
	@Autowired
	OrganizationRepository orgRepo;
	@Autowired
	PersonRepository persRepo;
	@Autowired
	ContactRepository contactRepo;
	
	//GET PERSON - contacts/person
	public List<Person> getPersonList(){
		return persRepo.findAll();
	}

	//GET PERSON BY ID - contacts/person/{pId}
	public Person getPerson(Long id) {
		return persRepo.findById(id);
	}

	//GET ORG - contacts/organization
	public List<Organization> getOrgList() {
		return orgRepo.findAll();
	}
	
	//GET ORG BY ID - /contacts/organization/{oId}
	public Organization getOrg(Long id) {
		return orgRepo.findById(id);
	}
	//GET ALL - /contacts
	public List<Contact> getAllContacts() {
		return contactRepo.findAll();
	}

	//POST PERSON - /contacts/person
	public List<Person> addPerson(Person person) {
		persRepo.save(person);
		return persRepo.findAll();
	}

	//POST ORG - /contacts/organization
	public List<Organization> addOrg(Organization org) {
		orgRepo.save(org);
		return orgRepo.findAll();
	}

	//PUT PERSON - /contacts/person/{pId}
	public List<Person> updatePerson(Long id, Person person) {
		Person pers = persRepo.getById(id);
		//@TODO - MAKE SURE TO ADD GETTER AND SETTER FOR UPDATES
	}

	//PUT ORG - /contacts/organization/{oId}
	public List<Organization> updateOrg(Long id, Organization org) {
		Organization organization = orgRepo.getById(id);
		//@TODO - MAKE SURE TO ADD GETTER AND SETTER FOR UPDATES
	}

	//DELETE PERSON -/contacts/person/{pId}
	public List<Person> deletePerson(Long id) {
		persRepo.deleteById(id);
		return persRepo.findAll();
	}

	//DELETE ORG - /contacts/organization/{oId}
	public List<Organization> deleteOrg(Long id) {
		orgRepo.deleteById(id);
		return orgRepo.findAll();
	}
	//DELETE ALL - /contacts
	public List<Contacts> deleteContacts() {
		contactRepo.deleteAll();
	}


}