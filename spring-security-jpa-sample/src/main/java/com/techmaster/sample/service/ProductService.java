package com.techmaster.sample.service;

import java.util.List;

import com.techmaster.sample.model.Product;

public interface ProductService {
	
	List<Product> getAll();
	
	Product getOne(Integer id);
	
	void save(Product product);
	
	void delete(Integer id);

}
