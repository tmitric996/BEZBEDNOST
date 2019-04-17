package com.example.Project.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.db.CertDB;
import com.example.Project.repository.CertRepo;

@Service
public class CertDAO {
	
	@Autowired
	CertRepo rp;
	
	public CertDB findOne(Long id){
		return rp.findOneById(id);
	}
	
	public List<CertDB> findAll(){
		return rp.findAll();
	}
	
	public CertDB save(CertDB c){
		return rp.save(c);
	}
	

}
