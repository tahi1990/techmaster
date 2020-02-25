package com.techmaster.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmaster.sample.model.Person;
import com.techmaster.sample.service.PersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class PersonController {

	@Autowired
	private PersonService service;

	@GetMapping("/people")
	public Flux<Person> getAllPeople() {
		return service.getAllPeople();
	}

	@PostMapping("/people")
	public Mono<Person> insertPerson(@RequestBody Person person) {
		return service.insert(person);
	}

}
