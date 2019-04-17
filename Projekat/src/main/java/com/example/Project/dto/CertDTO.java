package com.example.Project.dto;

import java.security.PublicKey;
import java.util.Date;

import org.bouncycastle.asn1.x500.X500Name;

import com.example.Project.model.CertType;
import com.example.Project.db.CertDB;
import com.example.Project.model.Certificate;

public class CertDTO {
	
	private Long id;
	
	private String org; //naziv organizacije
	
	private Long superior;
	
	private Date issueDate;
	private Date expDate;
	
	private boolean root;
	private boolean revoked;
	private boolean permission;
	
	private CertType type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public Long getSuperior() {
		return superior;
	}

	public void setSuperior(Long superior) {
		this.superior = superior;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}

	public boolean isRevoked() {
		return revoked;
	}

	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	public boolean isPermission() {
		return permission;
	}

	public void setPermission(boolean permission) {
		this.permission = permission;
	}

	public CertType getType() {
		return type;
	}

	public void setType(CertType type) {
		this.type = type;
	}
	
	public CertDTO(CertDB c) {
		this.id = c.getId();
		this.org = c.getOrg();
		this.superior = c.getSuperior();
		this.issueDate = c.getIssueDate();
		this.expDate = c.getExpDate();
		this.revoked = c.isRevoked();
		this.root = c.isRoot();
		this.permission = c.isPermission();
		this.type = c.getType();
	}

	public CertDTO(Certificate c) {
		this.id = c.getId();
		this.org = c.getOrg();
		this.superior = c.getSuperior();
		this.issueDate = c.getIssueDate();
		this.expDate = c.getExpDate();
		this.revoked = c.isRevoked();
		this.root = c.isRoot();
		this.permission = c.isPermission();
		this.type = c.getType();
	}
	
	
	
	
}
