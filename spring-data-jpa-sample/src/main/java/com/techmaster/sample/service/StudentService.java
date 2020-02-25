package com.techmaster.sample.service;

import java.util.List;

import com.techmaster.sample.model.Student;

public interface StudentService {

	public List<Student> getAll();

	public List<Student> getByName(String name);

	public List<Student> getByNameAndAge(String name, int age);

}
