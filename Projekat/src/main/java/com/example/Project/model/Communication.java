package com.example.Project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Communication {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long certA;
	private Long CertB;
	
	
	public Communication() {
		super();
	}


	public Communication(Long certA, Long certB) {
		super();
		this.certA = certA;
		this.CertB = certB;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCertA() {
		return certA;
	}


	public void setCertA(Long certA) {
		this.certA = certA;
	}


	public Long getCertB() {
		return CertB;
	}


	public void setCertB(Long certB) {
		CertB = certB;
	}
	
	
	
	
	
	
	
	
	
	

}
