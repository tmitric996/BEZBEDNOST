package com.example.Projekat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projekat.model.Korisnik;


public interface KorisnikRepo extends JpaRepository<Korisnik, Long> {

}
