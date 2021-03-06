package com.example.contacts.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="contact_id")
//@DiscriminatorValue(value = "Organization")
public class Organization extends Contact{
	
	private String website;
	
	public Organization() {
		super();
	}

	public Organization(Long id, String name, String phoneNumber, Date createdAt, String website) {
		super(id, name, phoneNumber);
		this.website = website;
	}
	
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	

}
