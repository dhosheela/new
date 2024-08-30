package com.dhosheeCont;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dhoshee.dto.Users;

import org.springframework.web.bind.annotation.RequestBody;
@RestController

public class User {
	
         @PostMapping("/save")
		public String postMethodName(@RequestBody Users users) {
			if(users.getName().equals("Dhoni")) {
				return"Valid";
			}
			return "Invalid";
		}
		

	}


