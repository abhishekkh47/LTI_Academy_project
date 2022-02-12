package com.app.reportx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.reportx.model.User;
import com.app.reportx.service.reportxService;

@RestController
public class reportxController {
	
	@Autowired
	private reportxService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUserName = user.getUserName();
		if(tempUserName != null && !"".equals(tempUserName)) {
			User userObj=service.fetchUserByUserName(tempUserName);
			if(userObj != null) {
				throw new Exception("user with username "+tempUserName+" is already exist");
			}
		}
		User userObj=null;
		userObj=service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempUserName = user.getUserName();
		String tempPassword = user.getPassword();
		User userobj = null;
		if(tempUserName !=null && tempPassword != null) {
			userobj=service.fetchUserByUserNameAndPassword(tempUserName, tempPassword);
		}
		if(userobj == null) {
			throw new Exception("Bad credentials");
		}
		return userobj;
	}
	}
