package com.leave.leavemanagement.dto;

public class RejectCarryforwardRequestDto {

	private Integer id;
	private CarryforwardRequestDto carryforwardRequest;
	private UserDto rejectedBy;
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarryforwardRequestDto getCarryforwardRequest() {
		return carryforwardRequest;
	}

	public void setCarryforwardRequest(CarryforwardRequestDto carryforwardRequest) {
		this.carryforwardRequest = carryforwardRequest;
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
