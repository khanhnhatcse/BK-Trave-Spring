package com.swift.nhat.bktravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swift.nhat.bktravel.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
	User findById(int user_id);
}
