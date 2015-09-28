package com.jdriven.stateless.security;

import org.springframework.security.core.GrantedAuthority;

public class UserAuthority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1671333758160901950L;

	private User user;
	private String authority;

	public UserAuthority() {
		
	}

	public UserAuthority(User user, String authority) {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
