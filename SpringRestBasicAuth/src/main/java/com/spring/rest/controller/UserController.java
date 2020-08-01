package com.spring.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.User;
import com.spring.rest.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/user/all", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listUser() {
		List<User> users = userService.getUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> listUser(@PathVariable(value = "id") String id) {
		User user = userService.getUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);

	}

	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> listUser(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<String>("User Created", HttpStatus.OK);
	}

}
