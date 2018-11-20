package com.leave.leavemanagement.dto;

public class ForwardLeaveRequestDto {

	Integer id;
	UserDto forwardTo;
	LeaveRequestDto leaveRequest;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserDto getForwardTo() {
		return forwardTo;
	}

	public void setForwardTo(UserDto forwardTo) {
		this.forwardTo = forwardTo;
	}

	public LeaveRequestDto getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequestDto leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

}
