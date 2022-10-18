package com.country.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class EmployeeService {
	@Autowired
	private Employeejpa ejpa;
	public List<EmployeeEntity> list(){
		return ejpa.findAll();
	}
	
	
	}



