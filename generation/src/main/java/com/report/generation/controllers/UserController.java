package com.report.generation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.generation.dto.LoginDto;
import com.report.generation.dto.UserDto;
import com.report.generation.entities.LoginResponse;
import com.report.generation.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDto userDto) {
		
		String res = userService.addUser(userDto);
		
		return res;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDto loginDto){
		
		LoginResponse response = userService.login(loginDto);
		
		return ResponseEntity.ok(response);
		
	}
	
	

}
