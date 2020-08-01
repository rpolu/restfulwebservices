package com.spring.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.User;

@RestController
public class ApplicationInfoController {
	@RequestMapping(path = "/info", method = RequestMethod.GET)
	public ResponseEntity<String> listUser(@RequestBody User user) {
		return new ResponseEntity<String>("General info of application", HttpStatus.OK);
	}
}
