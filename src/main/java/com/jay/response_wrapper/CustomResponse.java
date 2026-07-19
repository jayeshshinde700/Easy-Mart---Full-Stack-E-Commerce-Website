package com.jay.response_wrapper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CustomResponse {
	
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	private Object data;
}
