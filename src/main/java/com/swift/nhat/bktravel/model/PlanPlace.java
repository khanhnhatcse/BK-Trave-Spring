package com.swift.nhat.bktravel.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name = "plan_place")
public class PlanPlace implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Plan plan;
	
	@JsonView(View.Summary.class)
	private Place place;
	
	private int order;

	@Id
    @ManyToOne
    @JoinColumn(name = "plan_id")
	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	@Id
    @ManyToOne
    @JoinColumn(name = "place_id")
	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

    @Column(name = "`order`")
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	
	
	
	

}
