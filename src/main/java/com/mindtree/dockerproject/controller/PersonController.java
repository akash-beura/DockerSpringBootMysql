package com.mindtree.dockerproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.dockerproject.entity.Person;
import com.mindtree.dockerproject.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		return ResponseEntity.status(HttpStatus.OK).body(personService.registerPerson(person));
	}

	@GetMapping("/{personId}")
	public ResponseEntity<Person> getPerson(@PathVariable int personId) {
		return ResponseEntity.status(HttpStatus.OK).body(personService.getPerson(personId));
	}
}
