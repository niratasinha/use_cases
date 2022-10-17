package com.country.CRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControllerSchool {
	@Autowired
	private SchoolRepo sr;//up to date
	@GetMapping("/school") 
	public List<SchoolEntity> getSample(){
		ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
    	for(SchoolEntity emt:sr.findAll()) {
    		SchoolEntity temp=new SchoolEntity();
    		temp.setId(emt.getId());
    		
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}}

