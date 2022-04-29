package com.example.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.contacts.model.Contact;
import com.example.contacts.model.Organization;
import com.example.contacts.model.Person;
import com.example.contacts.service.ContactsService;

@Controller
@RequestMapping("/contacts")
public class ContactsController {
	
	@Autowired
	ContactsService contactService;
	
	//GET PERSON - contacts/person
	@GetMapping("/person")
	public List<Person> getPersonsList(){
		return contactService.getPersonList();
	}

	//GET PERSON BY ID - contacts/person/{pId}
	@GetMapping("/person/{pId}")
	public Person getPerson(@PathVariable(value="pId") Long id){
		return contactService.getPerson(id);
	}
	//GET ORG - /organization
	@GetMapping("/organization")
	public List<Organization> getOrganizationList(){
		return contactService.getOrgList();
	}

	//GET ORG BY ID - /organization/{oId}
	@GetMapping("/organization/{oId}")
	public Organization getOrganization(@PathVariable(value="oId") Long id){
		return contactService.getOrg(id);
	}
	//GET ALL - /contacts
	@GetMapping("")
	public List<Contact> getContacts(){
		return contactService.getAllContacts();
	}
	//POST PERSON - /person

	@PostMapping("/person")
	public List<Person> addPerson(@RequestBody Person person){
		return contactService.addPerson(person);
	}
	//POST ORG - /organization
	@PostMapping("/organization")
	public List<Organization> addOrg(@RequestBody Organization org){
		return contactService.addOrg(org);
	}
	//PUT PERSON - /person/{pId}
	@PostMapping("/person/{pId}")
	public List<Person> updatePerson(@PathVariable (value="pId")Long id, @RequestBody Person person){
		return contactService.updatePerson(id, person);
	}
	//PUT ORG - /organization/{oId}
	@PostMapping("/organization/{oId}")
	public List<Organization> updateOrg(@PathVariable (value="oId")Long id, @RequestBody Organization org){
		return contactService.updateOrg(id, org);
	}
	//DELETE PERSON -/person/{pId}
	@DeleteMapping("/person/{pId}")
	public List<Person> deletePerson(@PathVariable (value="pId")Long id) {
		return contactService.deletePerson(id);
	}
	//DELETE ORG - /organization/{oId}
	@DeleteMapping("/organization/{oId}")
	public List<Organization> deleteOrg(@PathVariable (value="oId")Long id) {
		return contactService.deleteOrg(id);
	}
	//DELETE ALL - /contacts
	@DeleteMapping("/contacts")
	public List<Contact> deleteContactList() {
		return contactService.deleteContacts();
	}
}
