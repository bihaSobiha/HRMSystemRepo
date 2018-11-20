package com.leave.leavemanagement.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.leave.leavemanagement.dto.UserData;
import com.leave.leavemanagement.entity.User;

public class UserToUserData {
	
	public static UserData mapToUserData(User user) {
		UserData UserData = new UserData();		
		if(user != null) {
			UserData.setUserId(user.getUserId());
			UserData.setUserName(user.getUserName());
		}
		return UserData;
	}
	
	public static List<UserData> mapToUserDataList(List<User> userList){
		List<UserData> UserDataList = new ArrayList<>();		
		if(userList != null) {
			for(User user:userList) {				
				UserDataList.add(mapToUserData(user));
			}			
		}
		return UserDataList;
	}

}
