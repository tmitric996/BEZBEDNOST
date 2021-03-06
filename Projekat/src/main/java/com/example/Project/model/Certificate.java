package com.example.Project.model;


import java.security.PublicKey;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bouncycastle.asn1.x500.X500Name;


public class Certificate {

	private Long id;

	private X500Name name;
	
	private String org; //naziv organizacije
	
	private Long superior;
	
	private Date issueDate;
	private Date expDate;
	
	private boolean root;
	private boolean revoked;
	private boolean permission;
	
	private PublicKey publicKey;
	
	private CertType type;

	public Certificate() {
		super();
	}

	public Certificate(Long id, String org, Long superior, Date issueDate, Date expDate, boolean root,
			boolean revoked, boolean permission, CertType type) {
		this.id = id;
		this.org = org;
		this.superior = superior;
		this.issueDate = issueDate;
		this.expDate = expDate;
		this.root = root;
		this.revoked = revoked;
		this.permission = permission;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public X500Name getName() {
		return name;
	}

	public void setName(X500Name name) {
		this.name = name;
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

	public PublicKey getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(PublicKey publicKey) {
		this.publicKey = publicKey;
	}

	public CertType getType() {
		return type;
	}

	public void setType(CertType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
}
