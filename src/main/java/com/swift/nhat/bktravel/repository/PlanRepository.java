package com.swift.nhat.bktravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swift.nhat.bktravel.model.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer>{
	List<Plan> findByDetail(Boolean detail);
	Plan findById(int id);
}
