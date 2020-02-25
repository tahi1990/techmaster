package com.techmaster.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmaster.sample.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
