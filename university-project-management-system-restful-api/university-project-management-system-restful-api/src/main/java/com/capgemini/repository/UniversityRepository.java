package com.capgemini.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.capgemini.entity.University;

@RepositoryRestController
public interface UniversityRepository extends JpaRepository<University, Integer> {
	
}