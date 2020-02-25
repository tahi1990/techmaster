package com.techmaster.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmaster.sample.model.Product;
import com.techmaster.sample.repository.ProductRepository;
import com.techmaster.sample.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	@Override
	public List<Product> getAll() {
		return repo.findAll();
	}

	@Override
	public Product getOne(Integer id) {
		return repo.getOne(id);
	}

	@Override
	public void save(Product product) {
		repo.save(product);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
