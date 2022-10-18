package com.country.CRUD;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController_A {
	@Autowired
	private EmployeeRepo er;//up to date
	@GetMapping("/A") 
	
		public ArrayList<EmployeeEntity> getSample(){
		ArrayList<EmployeeEntity> list=new ArrayList<EmployeeEntity>();
		for (EmployeeEntity emt:er.findAll()) {
			EmployeeEntity temp=new EmployeeEntity();
			
			if(emt.getEmployeeName().startsWith("a")) {
				temp.setId(emt.getId());
				temp.setEmployeeName(emt.getEmployeeName());
				list.add(temp);
			}
				}
		return list;
	}}

