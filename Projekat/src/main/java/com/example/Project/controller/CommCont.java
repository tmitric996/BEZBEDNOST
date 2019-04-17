package com.example.Project.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.dao.CommDAO;

@RestController
@RequestMapping(value="/communication")
public class CommCont {
	
	CommDAO dao;
	
	@PostMapping(value = "/create/{id1}/{id2}")
	public void create(@PathVariable long id1, @PathVariable long id2){
		dao.create(id1,  id2);
	}
	

}
