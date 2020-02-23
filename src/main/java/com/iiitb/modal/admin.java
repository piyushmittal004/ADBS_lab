package com.iiitb.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class admin {
	@Id
	private String AID;
	private String pass;
	
	public String getAID() {
		return AID;
	}
	public void setAID(String aID) {
		AID = aID;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
