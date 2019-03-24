package com.example.Project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.model.User;
import com.example.Project.repository.UserRepo;

@Service
public class UserImpl implements UserDAO {
	
	@Autowired
	UserRepo rp;
	
	/*sacuvaj korisnika*/
	public User saveUser(User user){
		return rp.save(user);
	}
	
	/*nadji po id*/
	public User findById(Long id){
		return rp.findOneById(id);	
	}
	
	public void deleteUser(Long id){
		rp.deleteById(id);
	}
	
	/*treba nadji po mail-u jos, proveriti*/
	
}
	