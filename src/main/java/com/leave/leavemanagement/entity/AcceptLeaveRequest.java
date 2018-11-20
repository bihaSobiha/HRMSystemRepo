package com.leave.leavemanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accept_leave_request")
public class AcceptLeaveRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5855081315920405445L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "request_id")
	private LeaveRequest request;

	@ManyToOne
	@JoinColumn(name = "accepted_by")
	private User acceptedBy;

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

	public User getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(User acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

}
