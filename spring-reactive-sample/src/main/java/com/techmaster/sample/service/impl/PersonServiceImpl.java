package com.techmaster.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmaster.sample.model.Person;
import com.techmaster.sample.repository.PersonRepository;
import com.techmaster.sample.service.PersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository repository;

	@Override
	public Flux<Person> createPerson(Mono<Person> person) {
		return repository.insert(person);
	}

	@Override
	public Flux<Person> getAllPeople() {
		return repository.findAll();
	}

	@Override
	public Mono<Person> insert(Person person) {
		return repository.insert(person);
	}

}
