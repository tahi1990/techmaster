package com.techmaster.sample.service;

import java.util.List;

import com.techmaster.sample.model.Student;

public interface StudentService {

	List<Student> getAllStudents();

	void insertStudent(Student student);

}
