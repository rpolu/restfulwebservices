package com.elegant.bank.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.elegant.bank.model.UserModel;

@Repository
public class UserRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	private String INSERT_USERS = "INSERT INTO BANK_USERS VALUES (?,?,?,?,?,?,?,?) ";
	private String GET_USER = "SELECT * FROM BANK_USERS WHERE USERNAME = ?";
	private String GET_USERS = "SELECT * FROM BANK_USERS";

	public void registerUser(UserModel userModel) {
		jdbcTemplate.update(INSERT_USERS, userModel.getFirstName(), userModel.getLastName(), userModel.getEmail(),
				userModel.getPhno(), userModel.getUserName(), passwordEncoder.encode(userModel.getPassword()), userModel.getRole(),
				userModel.getEnabled());
	}

	public UserModel getUserDetails(String userName) {
		UserModel userModel = new UserModel();
		SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(GET_USER, userName);
		
		if (sqlRowSet.next()) {
			userModel.setFirstName(sqlRowSet.getString("FIRSTNAME"));
			userModel.setLastName(sqlRowSet.getString("LASTNAME"));
			userModel.setEmail(sqlRowSet.getString("EMAIL"));
			userModel.setPhno(sqlRowSet.getString("PHNO"));
			userModel.setUserName(userName);
			userModel.setRole(sqlRowSet.getString("ROLE"));
			userModel.setEnabled(sqlRowSet.getString("ENABLED"));
		}
		return userModel;
	}

	public List<UserModel> getAllUsers() {
		List<UserModel> userModels = new ArrayList<UserModel>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(GET_USERS);
		for (Map<String, Object> row : rows) {
			UserModel userModel = new UserModel();
			userModel.setFirstName((String) row.get("FIRSTNAME"));
			userModel.setLastName((String) row.get("LASTNAME"));
			userModel.setEmail((String) row.get("EMAIL"));
			userModel.setPhno((String) row.get("PHNO"));
			userModel.setUserName((String) row.get("USERNAME"));
			userModel.setRole((String) row.get("ROLE"));
			userModels.add(userModel);
		}
		return userModels;
	}
}
