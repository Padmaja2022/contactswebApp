package com.example.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
