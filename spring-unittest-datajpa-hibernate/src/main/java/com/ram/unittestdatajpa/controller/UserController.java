package com.ram.unittestdatajpa.controller;

import java.util.List;

import com.ram.unittestdatajpa.repo.UserRepository;
import com.ram.unittestdatajpa.entity.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class UserController {

	private UserRepository repo;

	public UserController(UserRepository repo) {
		this.repo = repo;
	}
	
	@GetMapping("/")
	public List<Users> all() {
		return repo.findAll();
	}
	
}
