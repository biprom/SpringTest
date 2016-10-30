package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.model.Person;

@Repository (value = "personRepository")
public interface PersonRepository extends CrudRepository<Person, String> {
	
	
}
