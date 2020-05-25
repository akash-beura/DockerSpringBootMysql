package com.mindtree.dockerproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.dockerproject.entity.Person;
import com.mindtree.dockerproject.repository.PersonRepository;
import com.mindtree.dockerproject.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person registerPerson(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person getPerson(int personId) {
		return personRepository.findById(personId).get();
	}

}
