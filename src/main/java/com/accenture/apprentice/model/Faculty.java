package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the faculty database table.
 * 
 */
@Entity
public class Faculty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="faculty_id")
	private int userId;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date bday;

	@Column(name="email_address")
	private String emailAddress;

	@Column(name="email_verified")
	private String emailVerified;

	private String fname;

	private String gender;

	private String lname;

	private String mname;

	private String password;

	@Column(name="pic_file")
	private String picFile;

	private byte status;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="faculty")
	private List<Class> clazzs;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Department department;

	public Faculty() {
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

	public String getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(String emailVerified) {
		this.emailVerified = emailVerified;
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

	public String getPicFile() {
		return this.picFile;
	}

	public void setPicFile(String picFile) {
		this.picFile = picFile;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}