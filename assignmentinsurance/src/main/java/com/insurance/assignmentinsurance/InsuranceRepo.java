package com.insurance.assignmentinsurance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InsuranceRepo extends JpaRepository<InsuranceEntity,Integer>{
	@Query(value="select * from insurance i where i.insuranceid=?1",nativeQuery=true)
	List<InsuranceEntity> getjoin1(Integer insuranceid);

}
