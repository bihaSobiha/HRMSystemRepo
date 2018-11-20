package com.leave.leavemanagement.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.leave.leavemanagement.dto.LeaveTypeData;
import com.leave.leavemanagement.entity.LeaveType;

public class LeaveTypeToLeaveTypeData {
	
	public static LeaveTypeData mapToLeaveTypeData(LeaveType leaveType) {
		LeaveTypeData leaveTypeData = new LeaveTypeData();
		
		if(leaveType != null) {
			leaveTypeData.setId(leaveType.getId());
			leaveTypeData.setLeaveTypeValue(leaveType.getLeaveTypeValue());
			leaveTypeData.setDefaultAllocation(leaveType.getDefaultAllocation());
			leaveTypeData.setCreatedAt(leaveType.getCreatedAt());
			leaveTypeData.setUpdatedAt(leaveType.getUpdatedAt());
		}
		return leaveTypeData;
	}
	
	public static List<LeaveTypeData> mapToLeaveTypeDataList(List<LeaveType> leaveTypeList){
		List<LeaveTypeData> leaveTypeDataList = new ArrayList<>();
		
		if(leaveTypeDataList != null) {
			for(LeaveType leaveType:leaveTypeList) {
				leaveTypeDataList.add(mapToLeaveTypeData(leaveType));
			}
		}
		return leaveTypeDataList;
	}

}
