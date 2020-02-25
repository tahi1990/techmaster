package com.techmaster.sample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmaster.sample.model.Student;
import com.techmaster.sample.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentController {

	StudentService service;

	@Autowired
	public StudentController(StudentService service) {
		this.service = service;
	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudents() {

		List<Student> students = service.getAllStudents();

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@PostMapping("/students")
	public ResponseEntity<Void> insertStudent(@Valid @RequestBody Student student) {
		service.insertStudent(student);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
