package com.example.Project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.Project.dto.UserDTO;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique = true)
	private Long id;
	
	@Column(name="username")
	private String username;
	/*
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "lastName", nullable = false)
	private String lastName;
	*/
	@Column(name = "pass", nullable = false)
	private String pass;
	/*
	@Column(name = "email", nullable = false)
	private String email;*/
	
	public User() {
	
	}

	public User(/*String name, String lastName, */String username, String pass/*, String email*/) {
		super();
		this.id = id;
		this.username = username;
		//this.name = name;
		//this.lastName = lastName;
		this.pass = pass;
		//this.email = email;
	}
	
	public User(UserDTO dto){
		this.username = dto.getUsername();
		this.pass = dto.getPassword();
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

	/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
*/
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
/*
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	*/
	
	
	
}
