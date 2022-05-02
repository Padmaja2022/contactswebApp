package com.example.contacts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.contacts.model.Person;

import com.example.contacts.repository.PersonRepository;




@SpringBootTest
class ContactsApplicationTests {
@Autowired
	//ContactRepository contact_repo;
    PersonRepository person_repo;
@Order(1)	
	@Test
	public void testCreate() {		
		Person p= new Person();
		p.setId(3L);
		p.setName("Padmaja");		
		p.setPhoneNumber("123-655-8976");	
		person_repo.save(p);
		assertNotNull(person_repo.findById(3L).get());
		
	} 
@Order(2)
@Test
	public void testReadAll() {
		List<Person> list = person_repo.findAll();
		assertTrue(list.size()>0);
	}
@Order(3)
@Test
public void testSingleContact() {	
Person person =person_repo .findById(3L).get();
	assertEquals("Padmaja", person.getName());
				
	}
@Order(4)
@Test
public void testUpdate() {	
	Person p = person_repo.findById(3L).get();
	p.setPhoneNumber("123-457-8976");
	person_repo.save(p);	
	assertNotEquals(123-655-8976,person_repo.findById(3L).get().getPhoneNumber());
		
	
}



}
