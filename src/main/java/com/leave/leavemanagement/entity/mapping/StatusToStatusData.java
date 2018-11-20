package com.leave.leavemanagement.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.leave.leavemanagement.dto.StatusData;
import com.leave.leavemanagement.entity.Status;

public class StatusToStatusData {
	
	public static StatusData mapToStatusData(Status status) {
		StatusData statusData = new StatusData();
		if(status != null) {
			statusData.setId(status.getId());
			statusData.setStatusValue(status.getStatusValue());
		}
		return statusData;
	}
	
	public static List<StatusData> mapToStatusDataList(List<Status> statusList){
		List<StatusData> statusDataList = new ArrayList<>();
		if(statusList != null) {
			for(Status status:statusList) {
				statusDataList.add(mapToStatusData(status));
			}
		}
		return statusDataList;
	}

}
