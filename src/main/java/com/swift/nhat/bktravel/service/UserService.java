package com.swift.nhat.bktravel.service;

import java.util.List;

import com.swift.nhat.bktravel.model.User;

public interface UserService {
	List<User> getAll();
	User get(int id);
	boolean insert(User user);
	boolean isUserExist(User user);
	User findByUserName(String username);
	User findById(int id);
}
