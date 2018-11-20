package com.leave.leavemanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reject_leave_request")
public class RejectLeaveRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4487356712259407256L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	
	@ManyToOne
	@JoinColumn(name = "request_id")
	LeaveRequest request;
	
	@ManyToOne
	@JoinColumn(name = "rejected_by")
	User rejectedBy;
	
	@Column(name = "reason")
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequest getRequest() {
		return request;
	}

	public void setRequest(LeaveRequest request) {
		this.request = request;
	}

	public User getRejectedBy() {
		return rejectedBy;
	}

	public void setRejectedBy(User rejectedBy) {
		this.rejectedBy = rejectedBy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
