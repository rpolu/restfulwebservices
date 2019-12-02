package com.spring.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.rest.model.User;

@Controller
public class UserController {

	@RequestMapping(path = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listUser() {
		return new ResponseEntity<List<User>>(getUsers(), HttpStatus.OK);
	}

	@RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> listUser(@PathVariable(value = "id") String id) {
		return new ResponseEntity<User>(
				getUsers().stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null), HttpStatus.OK);

	}

	@RequestMapping(path = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> listUser(@RequestBody User user) {
		return new ResponseEntity<String>("User Created", HttpStatus.OK);
	}

	private List<User> getUsers() {
		User user = new User();
		user.setId("12");
		user.setEmail("rpolu@gmail.com");
		user.setName("Rama Mohan");
		user.setAddress("Bangalore, Karnataka");

		User user1 = new User();
		user1.setId("13");
		user1.setEmail("rudra@gmail.com");
		user1.setName("Rudra");
		user1.setAddress("Bangalore, Karnataka");

		User user2 = new User();
		user2.setId("14");
		user2.setEmail("supriya@gmail.com");
		user2.setName("Reddy Garu");
		user2.setAddress("Bangalore, Karnataka");

		return Arrays.asList(user, user1, user2);
	}

}
