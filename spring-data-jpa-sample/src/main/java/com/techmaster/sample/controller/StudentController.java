package com.techmaster.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techmaster.sample.model.Student;
import com.techmaster.sample.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();

		List<Student> students = service.getByNameAndAge("Hiep", 28);
		model.addObject("students", students);
		model.setViewName("home");

		return model;
	}

}
