package com.leave.leavemanagement.dto;

public class RejectCancelRequestDto {

	private Integer id;
	private CancelLeaveRequestDto cancelLeaveRequest;
	private UserDto user;
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CancelLeaveRequestDto getCancelLeaveRequest() {
		return cancelLeaveRequest;
	}

	public void setCancelLeaveRequest(CancelLeaveRequestDto cancelLeaveRequest) {
		this.cancelLeaveRequest = cancelLeaveRequest;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
