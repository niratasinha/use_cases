package com.vehicle.CRUD;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="car")
public class CarEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer carid;
	private String carname;
	private Integer nooftyres;
	public Integer getcarid() {
		return carid;
		}
	public void setcarid(Integer carid) {
		this.carid = carid;
	}
	public String getcarname() {
		return carname;
	}
	public void setcarname(String carname) {
		this.carname = carname;
	}
	public Integer getnooftyres() {
		return nooftyres;
		}
	
	public void setnooftyres(Integer nooftyres) {
		this.nooftyres= nooftyres;
	}
	}
