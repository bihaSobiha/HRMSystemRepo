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
public class RejectCarryforwardRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2160999335910289857L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	private CarryforwardRequest carryforwardRequest;
	
	@ManyToOne
	@JoinColumn(name="rejected_by")
	private User user;
	
	private String reason;

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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
