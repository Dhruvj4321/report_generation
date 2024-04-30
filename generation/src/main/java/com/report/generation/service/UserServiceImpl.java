package com.report.generation.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.report.generation.dto.LoginDto;
import com.report.generation.dto.UserDto;
import com.report.generation.entities.LoginResponse;
import com.report.generation.entities.User;
import com.report.generation.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	

	@Override
	public String addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
		User newUser = new User();
		
		newUser.setName(userDto.getName());
		newUser.setEmail(userDto.getEmail());
		
		
	    newUser.setPassword(this.passwordEncoder.encode(userDto.getPassword()));
		
		userRepo.save(newUser);
		
		return "User saved successfully!";
	}

	@Override
	public LoginResponse login(LoginDto loginDto) {
		// TODO Auto-generated method stub
		
		User user1 = userRepo.findByEmail(loginDto.getEmail());
		
		
		
		if(user1!=null) {
			
			String password = loginDto.getPassword();
			String encodedPass = user1.getPassword();
			
			Boolean passCheck = passwordEncoder.matches(password, encodedPass);
			
			if(passCheck) {
				

				return new LoginResponse("Login successful!",true);
			}
			else {
				return new LoginResponse("Password incorrect",false);
			}
		}
		else {
			return new LoginResponse("Email does not exist",false);
		}
		
		
		
			
			
		}
		
		
		
		
		
	

}
