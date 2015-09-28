package com.jdriven.stateless.security;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	private Map<String, User> database = new HashMap<String, User>();
	
	public User findByUsername(String username) {
		return database.get(username);
	}
	
	public void save(User user) {
		database.put(user.getUsername(), user);
	}

	public Collection<User> findAll() {
		return database.values();
	}
}
