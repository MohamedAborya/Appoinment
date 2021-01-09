package com.Project.Ecommerce.data.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="Doctor_Info")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Doctor_ID")
	private Long id;
	
	@Column(name="first_Name")
	private String fName;
	
	@Column(name="last_Name")
	private String lName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="speciality")
	private String speciality;
	
	@Column(name="fees")
    private double fees;

//	@Column(name="clink_Id")
//	private Long clinkId;
	
	@Column(name="hospital_id")
	private Long hospitalId;
	
	@Column(name="mobile")
	private String mobile;
	
//	@OneToMany(mappedBy="doctor")
//	private List<Clink> clink;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

//	public Long getClinkId() {
//		return clinkId;
//	}
//
//	public void setClinkId(Long clinkId) {
//		this.clinkId = clinkId;
//	}

	public Long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}


}
