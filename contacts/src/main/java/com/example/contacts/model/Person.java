package com.example.contacts.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(referencedColumnName="contact_id")
@DiscriminatorValue(value = "Person")
public class Person extends Contact{
	
	private String email;
	private String dob;
	
	public Person (Long id, String name, String phoneNumber, Date createdAt, String email, String dob) {
		super(id, name, phoneNumber);
		this.email = email;
		this.dob = dob;
	}
	
	public Person () {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
