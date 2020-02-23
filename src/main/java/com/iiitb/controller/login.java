package com.iiitb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iiitb.modal.admin;
import com.iiitb.services.adminloginDao;


@Controller
public class login {

	@Autowired
	adminloginDao repo;
	
	
	@RequestMapping("/")
	public String home() {
		return ("welcome");
	}
	
	@RequestMapping("/login")
	public String adminhome() {
		return "login.jsp";
	}
	
	@RequestMapping("/adminhome")
	public String adminlogin(admin admin) {
		repo.save(admin);
		return "adminhome.jsp";
	}
	
}
