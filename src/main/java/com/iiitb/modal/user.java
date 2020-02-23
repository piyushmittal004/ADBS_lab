package com.iiitb.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
	@Id
	private String uname;
	private String pass;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
