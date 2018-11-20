package com.leave.leavemanagement.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "leave_type")
public class LeaveType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2817919463554444461L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "leave_type_value")
	private String leaveTypeValue;

	@Column(name = "default_allocation")
	private Float defaultAllocation;

	@CreationTimestamp
	@Column(name = "created_at")
	private ZonedDateTime createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at")
	private ZonedDateTime updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeaveTypeValue() {
		return leaveTypeValue;
	}

	public void setLeaveTypeValue(String leaveTypeValue) {
		this.leaveTypeValue = leaveTypeValue;
	}

	public Float getDefaultAllocation() {
		return defaultAllocation;
	}

	public void setDefaultAllocation(Float defaultAllocation) {
		this.defaultAllocation = defaultAllocation;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}
}
