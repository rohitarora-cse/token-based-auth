package com.jdriven.stateless.security;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/user/current", method = RequestMethod.GET)
	public User getCurrentUser() {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication instanceof UserAuthentication) {
			return ((UserAuthentication) authentication).getDetails();
		}
		return null;
	}

	@RequestMapping(value = "/admin/api/users", method = RequestMethod.GET)
	public Collection<User> list() {
		return userRepository.findAll();
	}

}
