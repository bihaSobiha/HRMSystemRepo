package com.leave.leavemanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class AcceptCarryforwardRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8390568963612482507L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private CarryforwardRequest carryforwardRequest;
	
	@ManyToOne
	@JoinColumn(name="accepted_by")
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarryforwardRequest getCarryforwardRequest() {
		return carryforwardRequest;
	}

	public void setCarryforwardRequest(CarryforwardRequest carryforwardRequest) {
		this.carryforwardRequest = carryforwardRequest;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
