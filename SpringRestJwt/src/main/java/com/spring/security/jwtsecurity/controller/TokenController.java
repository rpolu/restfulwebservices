package com.spring.security.jwtsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.jwtsecurity.model.JwtUser;
import com.spring.security.jwtsecurity.security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenController {

	@Autowired
	private JwtGenerator jwtGenerator;

	@PostMapping
	public String generate(@RequestBody final JwtUser jwtUser) {
		return jwtGenerator.generate(jwtUser);
	}
}
