package com.gjsgabriel.courseweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjsgabriel.courseweb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResource {

	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "225544" ,"12345");
		return ResponseEntity.ok().body(u);
	}
	
}