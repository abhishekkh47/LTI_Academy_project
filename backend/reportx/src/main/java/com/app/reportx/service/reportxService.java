package com.app.reportx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.reportx.model.User;
import com.app.reportx.repository.reportxRepo;

@Service
public class reportxService {
	@Autowired
	private reportxRepo repo;
	public User saveUser(User user) {
		return repo.save(user);
}
	public User fetchUserByUserName(String userName) {
		return repo.findByUserName(userName);
	}
	public User fetchUserByUserNameAndPassword(String userName,String password) {
		return repo.findByUserNameAndPassword(userName, password);
	}
}
