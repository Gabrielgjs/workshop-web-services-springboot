package com.gjsgabriel.courseweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gjsgabriel.courseweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
