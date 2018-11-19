package com.leave.leavemanagement.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RejectLeaveRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4487356712259407256L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String reason;

}
