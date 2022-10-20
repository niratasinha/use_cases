package com.vehicle.CRUD;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepo extends JpaRepository<CarEntity,Integer>{

	@Query(value="Select * from car c Join truck t On t.nooftyres=c.nooftyres")
	public List<CarEntity> getjoin();
}
