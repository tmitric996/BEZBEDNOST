package com.example.Projekat.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.Projekat.model.Korisnik;
import com.example.Projekat.repo.KorisnikRepo;

@Service
@Component
public class KorisnikDAO {

	@Autowired
	KorisnikRepo krp;
	
	/*sacuvaj korisnika*/
	public Korisnik save(Korisnik kor){
		
		return krp.save(kor);
	}
	
	
	/*pretrazi korisnike*/
	public List<Korisnik> findAll(){
		return krp.findAll();
	}
	
	/*get korisnika po id*/
	public Korisnik findOne(Long korId){
		return krp.findOne(korId);
	}
	
	/*obrisi korisnika po id*/
	public void delete(Korisnik kor){
		krp.delete(kor);
		
	}
	
	
	
}
