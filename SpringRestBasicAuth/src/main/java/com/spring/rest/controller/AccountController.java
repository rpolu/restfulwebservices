package com.spring.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.model.Account;

@RestController
public class AccountController {

	@RequestMapping(path = "/account", method = RequestMethod.POST)
	public ResponseEntity<Account> listUser(@RequestBody Account account) {
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

}
