package com.technosignia.TryCityCommission.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.TryCityCommission.entity.Fault;
import com.technosignia.TryCityCommission.exception.FaultException;
import com.technosignia.TryCityCommission.repository.FaultRepository;

@Service
public class FaultService {

	
	@Autowired
	FaultRepository faultRepository;
	
	
	public Fault createFault(Fault fault) {
		
		return faultRepository.save(fault);
		
	}
	public Iterable<Fault> getFaults() {
		return faultRepository.findAll();
	}
	public Fault getFaultById(Long id) {
		Optional<Fault> opFault = faultRepository.findById(id);
		Fault f1 = opFault.get();
		return f1;
	}
	public Fault updateFault(Long id,Fault updatedfault) throws FaultException {
		Optional<Fault> opFault = faultRepository.findById(id);
		Fault fault =null;
	
		if(opFault.isEmpty()) {
			throw new FaultException("Fault you are trying to update not present in db");
		}else {
			fault = opFault.get();
			fault.setDescription(updatedfault.getDescription());
			fault.setFaultNo(updatedfault.getFaultNo());
			return  faultRepository.save(fault);
		} 
		
	}
}
