package com.Project.Ecommerce.data.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="Clink_Address")
public class Clink {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Clink_ID")
	private Long id;
	
	@Column(name="clink_Address")
	private String address ;

	@Column(name="Clink_longitude")
	private double longitude ;
	


	@Column(name="Clink_latitude")
	private double latitude ;
 
	@Column(name="Doctor_ID")
    private Long doctorId ;
	
//	@ManyToOne
//	@JoinColumn(name="Doctor_ID", nullable=false)
//	private Doctor doctor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

//	public Doctor getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(Doctor doctor) {
//		this.doctor = doctor;
//	}
	

}
