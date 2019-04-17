package com.example.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.model.Certificate;
import com.example.Project.db.*;

public interface CertRepo extends JpaRepository<CertDB, Long> {

	List<CertDB> findAll();
	CertDB findOneById(long id);
	
}
