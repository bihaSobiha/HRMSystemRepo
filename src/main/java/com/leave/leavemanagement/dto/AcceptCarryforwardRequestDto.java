package com.leave.leavemanagement.dto;

public class AcceptCarryforwardRequestDto {

	private Integer id;
	private CarryforwardRequestDto carryforwardRequest;
	private UserDto acceptedBy;

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

	public UserDto getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(UserDto acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

}
