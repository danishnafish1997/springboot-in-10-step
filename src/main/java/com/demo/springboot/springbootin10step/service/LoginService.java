package com.demo.springboot.springbootin10step.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validater(String name,String pass){
		return name.equalsIgnoreCase("in28Minutes") && pass.equalsIgnoreCase("password");
	}
}
