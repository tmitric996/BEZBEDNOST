package com.example.Project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.dao.UserDAO;
import com.example.Project.dto.UserDTO;
import com.example.Project.model.User;
import com.example.Project.repository.UserRepo;

//kontroler pristupa servisu

@RestController
@RequestMapping(value = "/users") 
public class UserCont {
	
	@Autowired
	UserDAO dao;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable long id){
		User user = dao.findOne(id);
		
		if(user == null){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<UserDTO>(new UserDTO(user), HttpStatus.OK);
	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity<List<UserDTO>> findAll(){
		
		List<User> daos = dao.findAll();
		
		List<UserDTO> dtos = new ArrayList<UserDTO>();
		
		for(User u : daos){
			dtos.add(new UserDTO(u));
		}
		return new ResponseEntity<>(dtos, HttpStatus.OK);
		
	}

	@PostMapping(value="/create")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO dto){
		
		User u = new User(dto);
		u = dao.save(u);
		
		return new ResponseEntity<UserDTO>(new UserDTO(u), HttpStatus.OK);
			
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id){
		
		User u = dao.findOne(id);
		dao.delete(u);
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

