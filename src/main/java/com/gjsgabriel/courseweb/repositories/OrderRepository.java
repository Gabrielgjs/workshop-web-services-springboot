package com.gjsgabriel.courseweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.courseweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
