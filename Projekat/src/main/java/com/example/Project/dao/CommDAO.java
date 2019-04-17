package com.example.Project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.model.Communication;
import com.example.Project.repository.CommRepo;

@Service
public class CommDAO {
	
	@Autowired
	CommRepo rp;

	public void create(long a, long b){
		Communication c = new Communication(a, b);
		rp.save(c);
	}
	
	public Communication returnById(long id){
		return rp.findOneById(id);
	}
}
