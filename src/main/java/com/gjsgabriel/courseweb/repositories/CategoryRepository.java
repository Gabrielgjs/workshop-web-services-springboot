package com.gjsgabriel.courseweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.courseweb.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
