package com.example.contacts.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;


@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Contact {

	public Contact() {
		this.createdAt = LocalDateTime.now();

	}


	public Contact(Long id, String name, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_Id")
		private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "createdAt")
	private LocalDateTime createdAt = LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}




}
