package com.techmaster.sample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techmaster.sample.model.Product;
import com.techmaster.sample.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	ProductService service;

	@Autowired
	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping("/")
	public String home() {
		return "Welcome!";
	}

	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts() {

		List<Product> products = service.getAll();

		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<Void> saveProduct(@Valid @RequestBody Product product) {
		service.save(product);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/edit/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable Integer id, @Valid @RequestBody Product product) {
		product.setId(id);
		service.save(product);
		return new ResponseEntity<String>("Update Success!", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
		service.delete(id);
		return new ResponseEntity<String>("Delete Success!", HttpStatus.OK);
	}
}
