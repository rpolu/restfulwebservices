package com.elegant.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elegant.bank.model.UserModel;
import com.elegant.bank.service.UserService;

@RestController
@RequestMapping("/bank")
public class BankUserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user/register")
	public ResponseEntity<Void> registerUser(@RequestBody UserModel userModel) {
		userService.registerUser(userModel);
		ResponseEntity<Void> responseEntity = new ResponseEntity<Void>(HttpStatus.CREATED);
		return responseEntity;
	}

	@GetMapping("/users/getAll")
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping(value = "/getuser/{username}")
	public UserModel getUser(@PathVariable("username") String userName) {
		return userService.getUserDetails(userName);
	}

}
