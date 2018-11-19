package com.leave.leavemanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CarryforwardRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4841427676961457451L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer carryForwardDays;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	private Status status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarryForwardDays() {
		return carryForwardDays;
	}

	public void setCarryForwardDays(Integer carryForwardDays) {
		this.carryForwardDays = carryForwardDays;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

}
