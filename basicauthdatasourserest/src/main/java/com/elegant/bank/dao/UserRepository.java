package com.elegant.bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.elegant.bank.model.UserModel;

@Repository
public class UserRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void registerUser(UserModel userModel) {

	}

	public String loginUser(String userName, String password) {
		return null;
	}

}
