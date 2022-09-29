package com.udec.demodatabases.service;

import org.springframework.stereotype.Component;

import com.udec.demodatabases.model.admin.Admin;
import com.udec.demodatabases.model.user.User;

@Component
public interface ITestService {

	public void guardarAdmin(Admin admin);
	
	public void guardarUser(User user);
	
}
