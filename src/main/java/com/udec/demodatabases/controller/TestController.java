package com.udec.demodatabases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udec.demodatabases.model.admin.Admin;
import com.udec.demodatabases.model.user.User;
import com.udec.demodatabases.service.ITestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private ITestService service;
	
	@PostMapping(path = "/guardarAdmin")
	public ResponseEntity<Admin> guardar(@RequestBody Admin admin) {
		service.guardarAdmin(admin);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping(path = "/guardarUser")
	public ResponseEntity<User> guardar(@RequestBody User user){
		service.guardarUser(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}
