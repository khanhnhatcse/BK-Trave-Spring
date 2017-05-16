package com.swift.nhat.bktravel.service;

import java.util.List;

import com.swift.nhat.bktravel.model.Plan;

public interface PlanService {
	List<Plan> getAll();
	Plan get(int id);
}
