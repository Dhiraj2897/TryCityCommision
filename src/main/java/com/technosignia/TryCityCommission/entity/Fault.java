package com.technosignia.TryCityCommission.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fault {

	@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String faultNo;
	String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFaultNo() {
		return faultNo;
	}

	public void setFaultNo(String faultNo) {
		this.faultNo = faultNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
