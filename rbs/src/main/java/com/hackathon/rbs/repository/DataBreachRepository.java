package com.hackathon.rbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hackathon.rbs.model.DataBreachDetails;

@Repository
public interface DataBreachRepository extends JpaRepository<DataBreachDetails, Long>{

	@Query("Select d from DataBreachDetails d where d.riskProfile = :riskProfile")
	List<DataBreachDetails> getAllDataBreachesByRisk(@Param("riskProfile") String riskProfile);
	
}
