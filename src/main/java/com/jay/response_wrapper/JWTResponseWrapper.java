package com.jay.response_wrapper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class JWTResponseWrapper {

	private long id;
	private String token;
	private String role;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
