package com.swift.nhat.bktravel.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	@JsonView(View.Summary.class)
	private int id;
	
	@NotEmpty
    @Column(name = "username", nullable = false, unique = true)
	@JsonView(View.Summary.class)
	private String username;
	
	@NotEmpty
    @Column(name = "fullname", nullable = false)
	@JsonView(View.Summary.class)
	private String fullname;
	
	@NotEmpty
    @Column(name = "password", nullable = false)
	@JsonView(View.Summary.class)
	private String password;
	
	@Temporal(TemporalType.DATE)
    @Column(name = "birthday", nullable = false)
	@JsonView(View.Summary.class)
	private Date birthday;
	
    @Column(name = "gender",nullable = false)
	@JsonView(View.Summary.class)
	private int gender;
	
	@Column(name = "email")
	@JsonView(View.Summary.class)
	private String email;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Plan> plans;
	
	
	
	public User() {
		super();
	}

	public User(String username, String fullname, String password, Date birthday, int gender, String email) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.birthday = birthday;
		this.gender = gender;
		this.email = email;
		this.plans = new HashSet<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Plan> getPlans() {
		return plans;
	}

	public void setPlans(Set<Plan> plans) {
		this.plans = plans;
	}
}
