package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="admin_id")
	private int userId;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date bday;

	@Column(name="email_address")
	private String emailAddress;

	private String fname;

	private String gender;

	private String lname;

	private String mname;

	private String password;

	//bi-directional one-to-one association to Login
	//@OneToOne
	//@JoinColumn(name="admin_id")
	//private Login login;

	public Admin() {
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBday() {
		return this.bday;
	}

	public void setBday(Date bday) {
		this.bday = bday;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}