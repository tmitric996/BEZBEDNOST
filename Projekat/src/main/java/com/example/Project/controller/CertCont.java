package com.example.Project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.dao.CertDAO;
import com.example.Project.db.*;
import com.example.Project.dto.RevokedDTO;

@RestController
@RequestMapping(value="/certificates")
public class CertCont {
	
	CertDAO dao;
	
	@GetMapping(value="isRevoked/{id}")
	public ResponseEntity<RevokedDTO> getAnswer(@PathVariable long id){
		CertDB cDB = dao.findOne(id);
		
		if(cDB == null) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		RevokedDTO rDTO = new RevokedDTO(cDB);
		
		return new ResponseEntity<RevokedDTO>(rDTO, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
