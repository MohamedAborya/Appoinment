package com.Project.Ecommerce.data.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Employee {
	
    public enum Status{ADDED,IN_CHECK,APPROVED,ACTIVE}

	private Long id;
	
	private String fName;
	
	private String lName;
		
	private String contractInfo;
	
	private Status status; 

	
	
	public Employee() {
		this.status = Status.ADDED;

	}

	public Employee(Long id, String fName, String lName, String contractInfo, Status status) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.contractInfo = contractInfo;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getContractInfo() {
		return contractInfo;
	}

	public void setContractInfo(String contractInfo) {
		this.contractInfo = contractInfo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
	


}
