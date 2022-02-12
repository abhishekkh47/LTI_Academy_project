package com.app.reportx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.reportx.model.User;

public interface reportxRepo extends JpaRepository<User, Integer>{

	public User findByUserName(String userName);
	
	public User findByUserNameAndPassword(String userName,String password);
}
