package com.leave.leavemanagement.dto;

public class RejectLeaveRequestDto {

	private Integer id;
	LeaveRequestDto request;
	UserDto rejectedBy;
	private String reason;

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

	public UserDto getRejectedBy() {
		return rejectedBy;
	}

	public void setRejectedBy(UserDto rejectedBy) {
		this.rejectedBy = rejectedBy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
