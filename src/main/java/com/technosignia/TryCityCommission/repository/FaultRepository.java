package com.technosignia.TryCityCommission.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.TryCityCommission.entity.Fault;

@Repository
public interface FaultRepository extends CrudRepository<Fault, Long>{
	

}
