package com.Project.Ecommerce.data.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hospital_Address")
public class Hospital {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Hospital_ID")
	private Long id;
	
	@Column(name="Hospital_Name")
	private String name;
	
	@Column(name="Hospital_address")
	private String address;
	
	@Column(name="phone")
	private double phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

}
