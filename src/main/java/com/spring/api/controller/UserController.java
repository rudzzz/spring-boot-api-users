package com.spring.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.model.Users;
import com.spring.api.repositoy.UserRepositoy;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepositoy userRepository;
	@GetMapping
	public List<Users> listUsers() {
		return userRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Users addUser(@RequestBody Users user) {
		return userRepository.save(user);
	}
}
