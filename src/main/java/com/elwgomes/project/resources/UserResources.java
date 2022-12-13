package com.elwgomes.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elwgomes.project.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll () {
		User u = new User(1L, "Mary", "maria@maria.com", "82911113333", "senha123");
		return ResponseEntity.ok().body(u);
	}
}