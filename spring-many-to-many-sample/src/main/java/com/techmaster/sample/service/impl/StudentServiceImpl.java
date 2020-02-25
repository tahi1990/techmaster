package com.techmaster.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmaster.sample.model.Student;
import com.techmaster.sample.repository.StudentRepository;
import com.techmaster.sample.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	@Autowired
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Student> getAllStudents() {
		return repository.findAll();
	}

	@Override
	public void insertStudent(Student student) {
		repository.save(student);
	}

}
