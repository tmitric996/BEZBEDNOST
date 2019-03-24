package com.example.Project.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Project.model.User;
import com.example.Project.repository.UserRepo;

@Service
public interface UserDAO {
	
	User saveUser(User user);
	User findById(Long id);
	void removeUser(Long id);
}

