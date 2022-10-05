package com.wipro.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
	
	private long userId;
	private String username;
	private String email;
	private long departmentId;
	

}
