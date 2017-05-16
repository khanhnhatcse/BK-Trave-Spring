package com.swift.nhat.bktravel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.swift.nhat.bktravel.model.User;
import com.swift.nhat.bktravel.model.View;
import com.swift.nhat.bktravel.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService userService;
	
	@JsonView(View.Summary.class)
	@RequestMapping(value = "/user" ,method = RequestMethod.GET)
	public ResponseEntity<List<User>> listUsers()
	{
		List<User> users = userService.getAll();
		if(users.isEmpty()){
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	public ResponseEntity<?> addUser(User user){
		return null;
	}
	
	
	
	
	
}
