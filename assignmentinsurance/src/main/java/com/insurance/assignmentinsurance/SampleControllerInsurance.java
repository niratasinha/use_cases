package com.insurance.assignmentinsurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleControllerInsurance {
	@Autowired

	private InsuranceRepo ir;
	@GetMapping ("/insurance")
	public List<InsuranceEntity> getinsuranceid(){
		return ir.getjoin1(2);
	}
	@GetMapping("/client_discount/{tenure}/{prem}")
	public int discount(@PathVariable String tenure, @PathVariable int prem) {
//		final String more = "morethanfive";
//		final String less = "lessthanfive";
//		final String equal = "equalfive";
				
		if(tenure.equals("morethanfive")) {
			prem=(int)(prem-(prem*0.12));
			return prem;
		}
		if(tenure.equals("equalfive")) {
			prem=(int)(prem-(prem*0.1));
			return prem;
		}
		if(tenure.equals("lessthanfive")) {
			return prem;
		}
		else {
			return 0;
		}
	}
@Autowired
	private ClientRepo cr;
	@GetMapping ("/client")
	public List<ClientEntity> getclientid(){
		return cr.getjoin2(2);
	}

}
