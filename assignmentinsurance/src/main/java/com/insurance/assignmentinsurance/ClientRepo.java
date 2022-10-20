package com.insurance.assignmentinsurance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepo extends JpaRepository<ClientEntity,Integer> {
	@Query(value="select * from client c where c.clientid=?1",nativeQuery=true)
	List<ClientEntity> getjoin2(Integer clientid);
}
