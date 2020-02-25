package com.techmaster.sample.service;

import com.techmaster.sample.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {

	Flux<Person> createPerson(Mono<Person> person);

	Flux<Person> getAllPeople();

	Mono<Person> insert(Person person);

}
