package com.techmaster.sample.service;

import java.util.List;

import com.techmaster.sample.model.Category;

public interface CategoryService {

	void save(Category category);

	List<Category> getAll();
}
