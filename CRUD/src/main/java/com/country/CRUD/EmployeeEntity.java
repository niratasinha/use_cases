package com.country.CRUD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private String employeeName;
private String dept;
public Integer getId() {
return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public String getEmpdept() {
	return dept;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public void setEmpdept(String empdept) {
	this.dept = empdept;
}
}
