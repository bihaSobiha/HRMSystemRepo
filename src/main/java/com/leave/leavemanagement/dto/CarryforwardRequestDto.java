package com.leave.leavemanagement.dto;

import java.time.ZonedDateTime;

public class CarryforwardRequestDto {

	private Integer id;
	private Integer carryForwardDays;
	private UserDto user;
	private StatusDto status;
	private ZonedDateTime createdAt;
	private ZonedDateTime updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarryForwardDays() {
		return carryForwardDays;
	}

	public void setCarryForwardDays(Integer carryForwardDays) {
		this.carryForwardDays = carryForwardDays;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public StatusDto getStatus() {
		return status;
	}

	public void setStatus(StatusDto status) {
		this.status = status;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
