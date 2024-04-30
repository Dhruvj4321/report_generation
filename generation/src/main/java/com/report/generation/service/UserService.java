package com.report.generation.service;

import com.report.generation.dto.LoginDto;
import com.report.generation.dto.UserDto;
import com.report.generation.entities.LoginResponse;

public interface UserService {
	
	
	String addUser(UserDto userDto);
	
	LoginResponse login(LoginDto loginDto);
	

}
