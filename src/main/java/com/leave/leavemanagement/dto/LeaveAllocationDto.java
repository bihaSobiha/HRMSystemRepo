package com.leave.leavemanagement.dto;

public class LeaveAllocationDto {

	private Integer id;
	private UserDto user;
	private LeaveTypeDto leaveType;
	private Float allocatedDays;
	private Float utilizedDays;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public LeaveTypeDto getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveTypeDto leaveType) {
		this.leaveType = leaveType;
	}

	public Float getAllocatedDays() {
		return allocatedDays;
	}

	public void setAllocatedDays(Float allocatedDays) {
		this.allocatedDays = allocatedDays;
	}

	public Float getUtilizedDays() {
		return utilizedDays;
	}

	public void setUtilizedDays(Float utilizedDays) {
		this.utilizedDays = utilizedDays;
	}

}
