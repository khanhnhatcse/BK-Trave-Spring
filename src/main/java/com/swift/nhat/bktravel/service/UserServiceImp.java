package com.swift.nhat.bktravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swift.nhat.bktravel.model.User;
import com.swift.nhat.bktravel.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User user) {
		userRepo.save(user);
		return false;
	}

	@Override
	public boolean isUserExist(User user) {
		return findByUserName(user.getUsername())!= null;
	}

	@Override
	public User findByUserName(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
