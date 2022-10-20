package com.vehicle.CRUD;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="truck")
public class TruckEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer truckid;
	private String truckname;
	private Integer nooftyres;
	public Integer gettruckid() {
		return truckid;
		}
	public void settruckid(Integer truckid) {
		this.truckid = truckid;
	}
	public String gettruckname() {
		return truckname;
	}
	public void settruckname(String truckname) {
		this.truckname = truckname;
	}
	public Integer getnooftyres() {
		return nooftyres;
		}
	
	public void setnooftyres(Integer nooftyres) {
		this.nooftyres= nooftyres;
	}
}
