package com.techmaster.sample.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.techmaster.sample.model.Person;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

}
