package com.technosignia.TryCityCommission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.TryCityCommission.entity.Fault;
import com.technosignia.TryCityCommission.exception.FaultException;
import com.technosignia.TryCityCommission.service.FaultService;

@RestController
public class FaultController {
	
	@Autowired
	FaultService faultService;
	
	@PostMapping("/fault")
	public Fault createFault(@RequestBody Fault fault) {
		return faultService.createFault(fault);
		
	}
	@GetMapping("/fault")
	public Iterable<Fault> getAllFaults() {
		
		return faultService.getFaults();
	}
	
	@GetMapping("api/fault")
	public Fault getFaultByIdParam(@RequestParam Long id) {
		
		return faultService.getFaultById(id);
		
	}
	@GetMapping("/fault/{id}")
	public Fault getFaultById(@PathVariable Long id) {
		
		return faultService.getFaultById(id);
		
	}
	@PutMapping("/fault/{id}")
	public Fault editFault(@PathVariable Long id, @RequestBody Fault fault) {
		
		try {
			return faultService.updateFault(id,fault);
		} catch (FaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
