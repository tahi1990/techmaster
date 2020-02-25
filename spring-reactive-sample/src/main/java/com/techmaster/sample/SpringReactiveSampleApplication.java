package com.techmaster.sample;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.server.ServerResponse.status;
import static org.springframework.web.reactive.function.BodyExtractors.toMono;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.techmaster.sample.model.Person;
import com.techmaster.sample.repository.PersonRepository;
import com.techmaster.sample.service.PersonService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableReactiveMongoRepositories
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class SpringReactiveSampleApplication {

	@Autowired
	PersonService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveSampleApplication.class, args);
	}

//	@Bean
//	RouterFunction<ServerResponse> getAllPeople() {
//		return RouterFunctions.route(RequestPredicates.GET("/people"), req -> {
//			return ok().body(service.getAllPeople(), Person.class);
//		});
//	}
//
//	@Bean
//	RouterFunction<ServerResponse> createPerson() {
//		return RouterFunctions.route(RequestPredicates.POST("/people"), req -> {
//			Flux<Person> personFlux = service.createPerson(req.bodyToMono(Person.class));
//			return status(201).body(personFlux, Person.class);
//		});
//	}

}
