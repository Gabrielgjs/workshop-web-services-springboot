package com.gjsgabriel.courseweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.courseweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
