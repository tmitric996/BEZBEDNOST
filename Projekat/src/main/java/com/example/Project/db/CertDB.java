package com.example.Project.db;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.Project.model.CertType;
import com.example.Project.model.Certificate;

@Entity
@Table(name="certificates")
public class CertDB {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Long id;
	
	@Column(name = "organization", nullable = true)
	private String org;
	
	@Column(name = "superiorSertificateId", nullable = true)
	private Long superior;
	
	@Column(name = "issueDate", nullable = false)
	private Date issueDate;
	
	@Column(name = "expirationDate", nullable = false)
	private Date expDate;
	
	@Column(name = "revoked")
	private boolean revoked;
	
	@Column(name = "root")
	private boolean root;
	
	@Column(name = "permission")
	private boolean permission;
	
	
	@Column(name = "type")
	private CertType type;

	@Column(name = "publicKey", length=1000)
	private byte[] publicKey;
	
	public CertDB() {
		
	}
	
	public CertDB(String org, Long superior, Date issueDate, Date expDate, boolean revoked, boolean root,
			boolean permission, CertType type, byte[] publicKey) {
		this.org = org;
		this.superior = superior;
		this.issueDate = issueDate;
		this.expDate = expDate;
		this.revoked = revoked;
		this.root = root;
		this.permission = permission;
		this.type = type;
		this.publicKey = publicKey;
	}
	
	public CertDB(Certificate c, Long superior){
		this.superior = superior;
		this.issueDate = c.getIssueDate();
		this.expDate = c.getExpDate();
		this.revoked = c.isRevoked();
		this.root = c.isRoot();
		this.permission = c.isRevoked();
		this.type = c.getType();
		this.org = c.getOrg();

	}

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

	public boolean isRevoked() {
		return revoked;
	}

	public void setRevoked(boolean revoked) {
		this.revoked = revoked;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
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

	public byte[] getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(byte[] publicKey) {
		this.publicKey = publicKey;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
