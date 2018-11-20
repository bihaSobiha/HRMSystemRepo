package com.leave.leavemanagement.dto;

import java.util.Date;

public class HolidayCalendarDto {

	private Integer id;
	private Date date;
	private String description;
	private UserDto enteredBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserDto getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(UserDto enteredBy) {
		this.enteredBy = enteredBy;
	}

}
