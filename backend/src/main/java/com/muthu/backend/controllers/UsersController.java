package com.muthu.backend.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.backend.entity.User;
import com.muthu.backend.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	UserService userService;

	public UsersController(UserService userService) {

		this.userService = userService;
	}

	@GetMapping
	public List<User> getUsers() {

		return userService.getUsers();
	}

}
