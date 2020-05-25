package com.mindtree.dockerproject.service;

import com.mindtree.dockerproject.entity.Person;

public interface PersonService {
	
	public Person registerPerson(Person person);
	public Person getPerson(int personId);

}
