package com.gjsgabriel.courseweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.courseweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
