package com.iiitb.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iiitb.modal.brief;
import com.iiitb.modal.multipleAdbs;

@RestController
public class cohort_manager {
	
	@Autowired
	com.iiitb.services.cohort_ManagerDao repo;
	
	@PostMapping(path="/searchbyadbs", consumes= "application/json")
	public List<brief> view(@RequestBody multipleAdbs patientID) {
		ArrayList<Integer>adbsID = patientID.adbsID;
		List<brief> briefRecord = new ArrayList<brief>();
		
		for(int x:adbsID) {
			briefRecord.add(repo.findById(x).orElse(null));	
		}
		return briefRecord;
	}
}
