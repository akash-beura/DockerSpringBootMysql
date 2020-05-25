package com.mindtree.dockerproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.dockerproject.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
