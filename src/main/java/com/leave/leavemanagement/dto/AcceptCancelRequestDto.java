package com.leave.leavemanagement.dto;

public class AcceptCancelRequestDto {

	private Integer id;
	private CancelLeaveRequestDto cancelLeaveRequest;
	private UserDto acceptedBy;

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

	public UserDto getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(UserDto acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

}
