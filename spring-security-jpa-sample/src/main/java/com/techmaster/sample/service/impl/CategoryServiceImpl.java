package com.techmaster.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmaster.sample.model.Category;
import com.techmaster.sample.repository.CategoryRepository;
import com.techmaster.sample.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository repository;

	public void save(Category category) {
		repository.save(category);
	}

	public List<Category> getAll() {
		return repository.findAll();
	}

}
