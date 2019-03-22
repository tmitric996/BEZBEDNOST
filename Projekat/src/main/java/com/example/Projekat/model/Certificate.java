package com.example.Projekat.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificate {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column 
	private Long idIzdavaca;
	
	@Column
	private Long idPrimaoca;
	
	@Column
	private Date datumIzdavanja;
	
	@Column
	private Date datumIsticanja;
	
	@Column
	private boolean povucen;
	
	public Certificate(){
		
	}

	public Certificate(Long idIzdavaca, Long idPrimaoca, Date datumIzdavanja, Date datumIsticanja, boolean povucen) {
		super();
		this.idIzdavaca = idIzdavaca;
		this.idPrimaoca = idPrimaoca;
		this.datumIzdavanja = datumIzdavanja;
		this.datumIsticanja = datumIsticanja;
		this.povucen = povucen;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdIzdavaca() {
		return idIzdavaca;
	}

	public void setIdIzdavaca(Long idIzdavaca) {
		this.idIzdavaca = idIzdavaca;
	}

	public Long getIdPrimaoca() {
		return idPrimaoca;
	}

	public void setIdPrimaoca(Long idPrimaoca) {
		this.idPrimaoca = idPrimaoca;
	}

	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(Date datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public Date getDatumIsticanja() {
		return datumIsticanja;
	}

	public void setDatumIsticanja(Date datumIsticanja) {
		this.datumIsticanja = datumIsticanja;
	}

	public boolean isPovucen() {
		return povucen;
	}

	public void setPovucen(boolean povucen) {
		this.povucen = povucen;
	}
	
	
		
	
}
