package com.example.contacts.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="contact_id")
//@DiscriminatorValue(value = "Person")
public class Person extends Contact{
	
	private String email;
	private Date dob;
	
	public Person (Long id, String name, String phoneNumber, Date createdAt, String email, Date dob) {
		super(id, name, phoneNumber, createdAt);
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
