package com.techmaster.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/hello")
	public ResponseEntity<String> helloUser() {
		return new ResponseEntity<String>("Hello Hiep", HttpStatus.OK);
	}

}
