package com.Reto1.springboot.app.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reto1.springboot.app.CrudRepository.UserCrudRepository;
import com.Reto1.springboot.app.Models.entities.User;



@Repository
public class UserRepository {
	
	@Autowired
	UserCrudRepository userCrud;
	
	//1. Listar todos los usuarios
	 public List<User> getAll(){
	        return (List<User>) userCrud.findAll();
	   }
	 
	 //2. Registrar usuarios
	 public User save(User p){
	        return userCrud.save(p);
	  }
	 
	 //3. Validar si existe email
	 
	 
}
