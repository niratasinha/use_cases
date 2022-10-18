package com.country.CRUD;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleControllerID {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/id") 
	
		public ArrayList<Integer> getId(){
		ArrayList<Integer> eid=new ArrayList<Integer>();
		for (EmployeeEntity emt:er.findAll()) {
			eid.add(emt.getId());
		}
		return eid;
	}}
