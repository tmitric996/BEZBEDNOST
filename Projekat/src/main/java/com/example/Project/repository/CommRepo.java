package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.model.Communication;

public interface CommRepo extends JpaRepository<Communication, Long> {

	Communication findOneById(long id);
	
}
