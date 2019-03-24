package com.example.Project.controller;

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

import com.example.Project.dao.UserDAO;
import com.example.Project.model.User;
import com.example.Project.repository.UserRepo;

//kontroler pristupa servisu

@RestController
@RequestMapping("/user") 
public class UserCont {
	
//	@Autowired
//	UserDAO userDao;
//	
//	/*cuvanje korisnika u bazu*/
//	
//	@PostMapping("/users")
//	public User createUser(@Valid @RequestBody User user){
//		
//		return userDao.save(user);
//	}
//	
//	/*dobavljanje korisnika*/
//	
//	@GetMapping("/users")
//	public List<User> dobaviSveKorisnike(){
//		return userDao.findAll();
//	}
//	
//	/*dobavljanje po id*/
//	@GetMapping("/notes/{id}")
//	public ResponseEntity<User> dobaviPoId(@PathVariable(value = "id") Long korId){
//		
//		User kor = userDao.findOne(korId);
//		
//		if(kor==null){
//			return ResponseEntity.notFound().build();
//			
//		}
//		return ResponseEntity.ok().body(kor);
//	}
//	
//	/*azuriranje korisnika*/
//	@PutMapping("/korisnici/{id}")
//	public ResponseEntity<User> azurirajKorisnika(@PathVariable(value = "id") Long korId, @Valid @RequestBody User korDetails){
//		
//		User kor = userDao.findOne(korId);
//		
//		if(kor==null){
//			return ResponseEntity.notFound().build();
//			
//		}
//		kor.setIme(korDetails.getIme());
//		kor.setPrz(korDetails.getPrz());
//		kor.setPass(korDetails.getPass());
//		kor.setEmail(korDetails.getEmail());
//		
//		User azurirani = userDao.save(kor);
//		
//		return ResponseEntity.ok().body(azurirani);
//		
//	}
//	
//	
//	/*brisanje*/
//	@DeleteMapping("/korisnici/{id}")
//	public ResponseEntity<User> obrisi(@PathVariable(value = "id") Long korId){
//		
//		User kor = userDao.findOne(korId);
//		
//		if(kor==null){
//			return ResponseEntity.notFound().build();
//			
//		}
//		userDao.delete(kor);
//		
//		return ResponseEntity.ok().build();
//		
//		
//		
//	}
//	
//	
	
}
	
	
	
	
	
	


