package com.spring.rest.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.rest.model.User;

@Service
public class UserService {
	private Map<String, User> users = new HashMap<String, User>();

	public UserService() {
		User user = new User();
		user.setId("12");
		user.setEmail("abc@gmail.com");
		user.setName("anup");
		user.setAddress("Bangalore, Karnataka");

		User user1 = new User();
		user1.setId("13");
		user1.setEmail("ayza@gmail.com");
		user1.setName("sujana");
		user1.setAddress("Bangalore, Karnataka");

		User user2 = new User();
		user2.setId("14");
		user2.setEmail("lmn@gmail.com");
		user2.setName("Thulasi");
		user2.setAddress("Kadapa, Andhra");
		users.put(user.getId(), user);
		users.put(user1.getId(), user1);
		users.put(user2.getId(), user2);
	}

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>(users.values());
		return list;
	}

	public User getUser(String id) {
		return users.get(id);
	}

	public void saveUser(User user) {
		users.put(user.getId(), user);
	}

}
