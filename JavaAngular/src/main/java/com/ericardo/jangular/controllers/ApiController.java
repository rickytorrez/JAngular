package com.ericardo.jangular.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericardo.jangular.models.User;
import com.ericardo.jangular.repositories.UserRepository;

@RestController
public class ApiController {

	@Autowired
	private UserRepository _uR;
	
	@RequestMapping(value="/api/insertUser", produces="application/json")
	public Object getDate() {
		
		User user = new User();
		user.setId(1L);
		user.setName("Bob");
		
		_uR.save(user);
		
		return user;
	}
	
}
