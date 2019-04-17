package com.example.Project.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.Project.db.CertDB;

public class RevokedDTO {
	
	private Long id;
	
	private boolean revoked;
	
	private String timeStamp;
	
	public RevokedDTO(CertDB db){
		super();
		this.id = db.getId();
		this.revoked = db.isRevoked();
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss");
		this.timeStamp = format.format(new Date());
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isRevoked() {
		return revoked;
	}

	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
