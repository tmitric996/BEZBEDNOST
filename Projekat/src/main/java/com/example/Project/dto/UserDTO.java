package com.example.Project.dto;

import com.example.Project.model.User;

public class UserDTO {
	

	private Long id;
	private String username;
	private String password;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User user) {
		super();
		this.id = user.getId();
		this.username = user.getUsername();
		//this.password = user.getPassword();
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}
