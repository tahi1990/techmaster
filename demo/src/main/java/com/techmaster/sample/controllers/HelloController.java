package com.techmaster.sample.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	String message = "Hiep";

	@RequestMapping("/hello")
	public String hello(Map<String, Object> model) {
		model.put("message", this.message);
		model.put("abc", "123");
		return "index";
	}

}
