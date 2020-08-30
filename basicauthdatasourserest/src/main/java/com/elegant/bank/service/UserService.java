package com.elegant.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elegant.bank.dao.UserRepository;
import com.elegant.bank.model.UserModel;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void registerUser(UserModel userModel) {
		userRepository.registerUser(userModel);
	}

	public UserModel getUserDetails(String userName) {
		return userRepository.getUserDetails(userName);
	}

	public List<UserModel> getAllUsers() {
		return userRepository.getAllUsers();
	}
}
