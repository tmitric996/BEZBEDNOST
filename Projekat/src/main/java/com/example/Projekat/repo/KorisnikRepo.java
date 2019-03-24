package com.example.Projekat.repo;

import com.example.Projekat.model.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface KorisnikRepo extends JpaRepository<Korisnik, Long> {

	Korisnik findOne(Long korId);



}
