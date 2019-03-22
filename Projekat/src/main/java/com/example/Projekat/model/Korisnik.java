package com.example.Projekat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Korisnik {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name = "ime", nullable = false)
	private String ime;
	
	@Column(name = "prz", nullable = false)
	private String prz;
	
	@Column(name = "pass", nullable = false)
	private String pass;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	public Korisnik() {
	
	}
	

	public Korisnik(String ime, String prz, String pass, String email) {
		super();
		this.ime = ime;
		this.prz = prz;
		this.pass = pass;
		this.email = email;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrz() {
		return prz;
	}

	public void setPrz(String prz) {
		this.prz = prz;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
