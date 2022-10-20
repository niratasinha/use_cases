package com.insurance.assignmentinsurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleControllerInsurance {
	@Autowired

	private InsuranceRepo ir;
	@GetMapping ("/insurance")
	public List<InsuranceEntity> getinsuranceid(){
		return ir.getjoin1(2);
	}
@Autowired
	private ClientRepo cr;
	@GetMapping ("/client")
	public List<ClientEntity> getclientid(){
		return cr.getjoin2(2);
	}

}
