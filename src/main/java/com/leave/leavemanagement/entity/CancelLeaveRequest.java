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
public class CancelLeaveRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8034925685651283963L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="leave_request_id")
	private LeaveRequest leaveRequest;
	
	private String reason;
	
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequest getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequest leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
