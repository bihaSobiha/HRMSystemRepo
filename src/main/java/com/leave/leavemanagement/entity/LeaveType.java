package com.leave.leavemanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2817919463554444461L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String leaveType;
	private Float defaultAllocation;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public Float getDefaultAllocation() {
		return defaultAllocation;
	}
	public void setDefaultAllocation(Float defaultAllocation) {
		this.defaultAllocation = defaultAllocation;
	}
	

}
