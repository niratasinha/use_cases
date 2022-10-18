package com.country.CRUD;


	import java.util.ArrayList;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class SampleControllerName {
		@Autowired
		private EmployeeRepo er;//up to date
		@GetMapping("/name") 
		
			public ArrayList<String> getEmployeeName(){
			ArrayList<String> ename=new ArrayList<String>();
			for (EmployeeEntity emt:er.findAll()) {
				ename.add(emt.getEmployeeName());
			}
			return ename;
		}}

