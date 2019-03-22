package com.example.Projekat.kontroler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Projekat.model.Korisnik;
import com.example.Projekat.repo.KorisnikRepo;

@RestController
@RequestMapping("/users") 
public class KorisnikKont {
	
	@Autowired
	KorisnikRepo rp;
	
	@RequestMapping("/findall")
	@ResponseBody
	public List<Korisnik> findall(){
		return rp.findAll();
		
	}
}
