package com.leave.leavemanagement.dto;

public class AcceptLeaveRequestDto {

	private Integer id;
	private LeaveRequestDto request;
	private UserDto acceptedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequestDto getRequest() {
		return request;
	}

	public void setRequest(LeaveRequestDto request) {
		this.request = request;
	}

	public UserDto getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(UserDto acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

}
