package com.swift.nhat.bktravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swift.nhat.bktravel.model.Plan;
import com.swift.nhat.bktravel.repository.PlanRepository;

@Service
public class PlanServiceImp implements PlanService {

	@Autowired
	private PlanRepository planRepo;
	
	@Override
	public List<Plan> getAll() {
		return planRepo.findByDetail(false);
	}

	@Override
	public Plan get(int id) {
		// TODO Auto-generated method stub
		return planRepo.findById(id);
	}

}
