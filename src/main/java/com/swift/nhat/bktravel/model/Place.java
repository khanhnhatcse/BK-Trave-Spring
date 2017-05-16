package com.swift.nhat.bktravel.model;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name = "Place")
public class Place  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "place_id", nullable = false)
	@JsonView(View.Summary.class)
	private int id;
	
	@NotEmpty
    @Column(name = "name", nullable = false, unique = true)
	@JsonView(View.Summary.class)
	private String name;

	@Column(name = "note")
	@JsonView(View.Summary.class)
	private String note;
	
	@Column(name = "longtitude", nullable = false)
	@JsonView(View.Summary.class)
	private Double longtitude;
	
	@Column(name = "latitude", nullable = false)
	@JsonView(View.Summary.class)
	private Double latitude;
	
	@Column(name = "total_rate")
	@JsonView(View.Summary.class)
	private int total_rate;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plan_id")
	@JsonView(View.Summary.class)
	private Plan plan;
	
	@OneToMany(mappedBy = "place")
	private Set<PlanPlace> planPlaces;
	

	public Place() {
		super();
	}

	public Place(String name, String note, Double longtitude, Double latitude) {
		super();
		this.name = name;
		this.note = note;
		this.longtitude = longtitude;
		this.latitude = latitude;
	}



	public Place(String name, String note, Double longtitude, Double latitude, Plan plan) {
		super();
		this.name = name;
		this.note = note;
		this.longtitude = longtitude;
		this.latitude = latitude;
		this.plan = plan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(Double longtitude) {
		this.longtitude = longtitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public int getTotal_rate() {
		return total_rate;
	}

	public void setTotal_rate(int total_rate) {
		this.total_rate = total_rate;
	}

	
	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	
	

	public Set<PlanPlace> getPlanPlaces() {
		return planPlaces;
	}

	public void setPlanPlaces(Set<PlanPlace> planPlaces) {
		this.planPlaces = planPlaces;
	}

	@Override
	public String toString() {
	    return String.format(
	            "Book[id=%d, name='%s']",
	                id, name);
	}
	
	
	
}
