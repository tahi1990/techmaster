package com.techmaster.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techmaster.sample.model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findStudentByName(@Param("name") String name);

	
	// Query annotation to customize query
	@Query("SELECT s FROM Student s WHERE s.name = :name AND s.age = :age")
	List<Student> find(@Param("name") String name, @Param("age") int age);

}
