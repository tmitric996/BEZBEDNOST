package com.example.Projekat.kontroler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.Projekat.dao.KorisnikDAO;
import com.example.Projekat.model.Korisnik;
import com.example.Projekat.repo.KorisnikRepo;

//kontroler pristupa servisu

@RestController
@RequestMapping("/users") 
public class KorisnikKont {
	
	@Autowired
	KorisnikDAO korDAO;
	
	/*cuvanje korisnika u bazu*/
	
	@PostMapping("/korisnici")
	public Korisnik kreirajKorisnika(@Valid @RequestBody Korisnik kor){
		
		return korDAO.save(kor);
	}
	
	/*dobavljanje korisnika*/
	
	@GetMapping("/korisnici")
	public List<Korisnik> dobaviSveKorisnike(){
		return korDAO.findAll();
	}
	
	/*dobavljanje po id*/
	@GetMapping("/notes/{id}")
	public ResponseEntity<Korisnik> dobaviPoId(@PathVariable(value = "id") Long korId){
		
		Korisnik kor = korDAO.findOne(korId);
		
		if(kor==null){
			return ResponseEntity.notFound().build();
			
		}
		return ResponseEntity.ok().body(kor);
	}
	
	/*azuriranje korisnika*/
	@PutMapping("/korisnici/{id}")
	public ResponseEntity<Korisnik> azurirajKorisnika(@PathVariable(value = "id") Long korId, @Valid @RequestBody Korisnik korDetails){
		
		Korisnik kor = korDAO.findOne(korId);
		
		if(kor==null){
			return ResponseEntity.notFound().build();
			
		}
		kor.setIme(korDetails.getIme());
		kor.setPrz(korDetails.getPrz());
		kor.setPass(korDetails.getPass());
		kor.setEmail(korDetails.getEmail());
		
		Korisnik azurirani = korDAO.save(kor);
		
		return ResponseEntity.ok().body(azurirani);
		
	}
	
	
	/*brisanje*/
	@DeleteMapping("/korisnici/{id}")
	public ResponseEntity<Korisnik> obrisi(@PathVariable(value = "id") Long korId){
		
		Korisnik kor = korDAO.findOne(korId);
		
		if(kor==null){
			return ResponseEntity.notFound().build();
			
		}
		korDAO.delete(kor);
		
		return ResponseEntity.ok().build();
		
		
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	KorisnikRepo rp;
//	
//	@RequestMapping("/findall")
//	@ResponseBody
//	public List<Korisnik> findall(){
//		return rp.findAll();
//		
//	}

