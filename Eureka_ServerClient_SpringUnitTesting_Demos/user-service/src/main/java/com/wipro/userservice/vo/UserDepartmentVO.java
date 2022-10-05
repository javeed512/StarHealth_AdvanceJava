package com.wipro.userservice.vo;

import com.wipro.userservice.entity.User;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDepartmentVO {
	
	
	private User user;
	private Department department;
	
	public UserDepartmentVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}
	
	
	

}
