package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Project.model.User;


public interface UserRepo extends JpaRepository<User, Long> {

	User findOneById(Long id);





}
