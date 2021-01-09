package com.Project.Ecommerce.data.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="User_Information")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_ID")
	private Long id;
	
	@Column(name="first_Name")
	private String fName;
	
	@Column(name="last_Name")
	private String lName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="type")
	private String type;
	
	@Column(name="mobile")
	private String mobile;
	

	@Column(name="password")
	private String password;

	
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String fName, String lName, String email, String type, String password) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.type = type;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
