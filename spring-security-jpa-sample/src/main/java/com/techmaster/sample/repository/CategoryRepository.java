package com.techmaster.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmaster.sample.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
