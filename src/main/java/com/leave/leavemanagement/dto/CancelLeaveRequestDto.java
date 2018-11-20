package com.leave.leavemanagement.dto;

public class CancelLeaveRequestDto {

	private Integer id;
	private LeaveRequestDto leaveRequest;
	private String reason;
	private StatusDto status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LeaveRequestDto getLeaveRequest() {
		return leaveRequest;
	}

	public void setLeaveRequest(LeaveRequestDto leaveRequest) {
		this.leaveRequest = leaveRequest;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public StatusDto getStatus() {
		return status;
	}

	public void setStatus(StatusDto status) {
		this.status = status;
	}

}
