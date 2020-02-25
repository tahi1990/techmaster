package com.techmaster.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmaster.sample.model.User;
import com.techmaster.sample.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService service;

	@Autowired
	PasswordEncoder passwordEncoder;

	@PostMapping
	public ResponseEntity<Void> createUser(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		service.createUser(user);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{username}")
	public ResponseEntity<User> getUser(@PathVariable String username) {

		return new ResponseEntity<User>(service.findByUsername(username), HttpStatus.OK);

	}

}
