package com.swift.nhat.bktravel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.swift.nhat.bktravel.model.Plan;
import com.swift.nhat.bktravel.model.View;
import com.swift.nhat.bktravel.service.PlanService;

@RestController
@RequestMapping("/api/v1")
public class PlanController {

	@Autowired
	private PlanService planService;
	
	/*-----------Lay tat ca cac plan--------------*/
	@JsonView(View.Summary.class)
	@RequestMapping( value = "/plan",method=RequestMethod.GET)
	//@RequestParam(value="name", defaultValue="World") String name
	public List<Plan> listAllPlans(){ 
		List<Plan> plans =  planService.getAll();
		return plans;

	}
	
	@JsonView(View.Summary.class)
	@RequestMapping( value = "/plan/{id}",method=RequestMethod.GET)
	public Plan getPlan(@PathVariable("id") int id){
		return planService.get(id);
	}
	
	
}
