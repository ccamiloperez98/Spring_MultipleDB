package com.udec.demodatabases.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udec.demodatabases.model.admin.Admin;
import com.udec.demodatabases.model.user.User;
import com.udec.demodatabases.repo.admin.IAdminRepo;
import com.udec.demodatabases.repo.user.IUserRepo;
import com.udec.demodatabases.service.ITestService;

@Service
public class TestServiceImp implements ITestService{
	
	@Autowired
	private IUserRepo userRepo;
	
	@Autowired
	private IAdminRepo adminRepo;
	

	@Override
	public void guardarAdmin(Admin admin) {
		adminRepo.save(admin);
		
	}

	@Override
	public void guardarUser(User user) {
		userRepo.save(user);
		
	}

}
