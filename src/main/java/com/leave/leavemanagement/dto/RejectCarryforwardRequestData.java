package com.leave.leavemanagement.dto;

public class RejectCarryforwardRequestData {

	private Integer id;
	private CarryforwardRequestData carryforwardRequest;
	private UserData rejectedBy;
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CarryforwardRequestData getCarryforwardRequest() {
		return carryforwardRequest;
	}

	public void setCarryforwardRequest(CarryforwardRequestData carryforwardRequest) {
		this.carryforwardRequest = carryforwardRequest;
	}

	public UserData getRejectedBy() {
		return rejectedBy;
	}

	public void setRejectedBy(UserData rejectedBy) {
		this.rejectedBy = rejectedBy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
