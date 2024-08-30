package com.Dhoshee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

public class Homecontroller {
	@GetMapping("/user")
	
	public Map<String,String>getUser(){
		Map<String,String>User=new HashMap<>();
		User.put("name","sheela");
		User.put("address","chennai");
		User.put("age","20");
		return User;		
		
	}

}
