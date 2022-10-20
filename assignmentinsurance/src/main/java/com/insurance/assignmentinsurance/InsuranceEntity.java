package com.insurance.assignmentinsurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="insurance")
public class InsuranceEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer insuranceid;
	private String insname;
	private Integer term;
	private Integer premium_amt;
	public Integer getinsuranceid() {
		return insuranceid;
		}
	public void setinsuranceid(Integer insuranceid) {
		this.insuranceid = insuranceid;
	}
	public String getinsname() {
		return insname;
	}
	public void setterm(Integer term) {
		this.term = term;
	}
		public Integer getterm() {
			return term;
		}
		public Integer getpremium_amt() {
			return premium_amt;
			}
	public Integer premium_amt() {
		return premium_amt;
		}
	
		}
	
	
	

