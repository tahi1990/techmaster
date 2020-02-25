package com.techmaster.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmaster.sample.model.Student;
import com.techmaster.sample.repository.StudentRepository;
import com.techmaster.sample.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	@Override
	public List<Student> getAll() {
		return repository.findAll();
	}

	@Override
	public List<Student> getByName(String name) {
		return repository.findStudentByName(name);
	}

	@Override
	public List<Student> getByNameAndAge(String name, int age) {
		return repository.find(name, age);
	}

}
