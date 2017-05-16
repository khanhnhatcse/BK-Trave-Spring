package com.swift.nhat.bktravel.model;



import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "Plan")
public class Plan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "plan_id", nullable = false)
	@JsonView(View.Summary.class)
	private int id;
	
	@NotEmpty
    @Column(name = "name", nullable = false, unique = true)
	@JsonView(View.Summary.class)
	private String name;
	
	@Column(name = "alarm")
	@JsonView(View.Summary.class)
	private boolean alarm;
	
	@Column(name = "detail")
	@JsonView(View.Summary.class)
	private boolean detail;
	
	@Column(name = "is_schedule")
	@JsonView(View.Summary.class)
	private boolean schedule;
	
	@Column(name = "create_date")
	@JsonView(View.Summary.class)
	private Date createDate;
	
	@Column(name = "start_date")
	@JsonView(View.Summary.class)
	private Date startDate;
	
	@ManyToOne
    @JoinColumn(name="user_id")
	private User user;
	
	@Column(name = "note")
	@JsonView(View.Summary.class)
	private String note;
	
	
	@OneToOne(mappedBy = "plan")
	private Place place;
	
	@OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonView(View.Summary.class)
	private Set<PlanPlace> planPlaces;

	public Plan() {
		super();
	}

	public Plan(String name) {
		super();
		this.name = name;
		this.planPlaces = new HashSet<>();
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
	public boolean isAlarm() {
		return alarm;
	}
	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}
	public boolean isSchedule() {
		return schedule;
	}
	public void setSchedule(boolean schedule) {
		this.schedule = schedule;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public boolean isDetail() {
		return detail;
	}

	public void setDetail(boolean detail) {
		this.detail = detail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}

	public Set<PlanPlace> getPlanPlaces() {
		return planPlaces;
	}

	public void setPlanPlaces(Set<PlanPlace> planPlaces) {
		this.planPlaces = planPlaces;
	}

}





