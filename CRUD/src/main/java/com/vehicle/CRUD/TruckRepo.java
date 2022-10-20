package com.vehicle.CRUD;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TruckRepo extends JpaRepository<TruckEntity,Integer> {
	@Query(value="Select * from truck t Join car c On c.nooftyres=t.nooftyres", nativeQuery=true)
	public List<TruckEntity> getjoin1();

}
