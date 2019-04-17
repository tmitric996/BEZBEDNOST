package com.example.Project.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Project.model.User;
import com.example.Project.repository.UserRepo;

@Service
public class UserDAO {

	@Autowired
	UserRepo rp;
	
	public List<User> findAll(){
		return rp.findAll();
	}
	
	public User findOne(long id){
		return rp.findOneById(id);
	}
	
	public User save(User user){
		return rp.save(user);
	}
	
	public void delete(User user){
		rp.delete(user);
	}
	
	public User findOne(String username){
		return rp.findOneByUsername(username);
	}
	
	
	
	
	
	
	
}
