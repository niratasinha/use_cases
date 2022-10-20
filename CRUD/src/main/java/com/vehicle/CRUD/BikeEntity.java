package com.vehicle.CRUD;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="bike")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bikeid;
	private String bikename;
	private Integer nooftyres;
	public Integer getbikeid() {
		return bikeid;
		}
	public void setbikeid(Integer bikeid) {
		this.bikeid = bikeid;
	}
	public String getbikename() {
		return bikename;
	}
	public void setbikename(String bikename) {
		this.bikename = bikename;
	}
	public Integer getnooftyres() {
		return nooftyres;
		}
	
	public void setnooftyres(Integer nooftyres) {
		this.nooftyres= nooftyres;
	}
}


