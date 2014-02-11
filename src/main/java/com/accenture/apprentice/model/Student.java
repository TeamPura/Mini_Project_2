package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_id")
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

	//bi-directional many-to-one association to CallInSick
	@OneToMany(mappedBy="student")
	private List<CallInSick> callInSicks;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="id_course")
	private Course course;

	//bi-directional many-to-one association to Propectus
	@ManyToOne
	@JoinColumn(name="id_prospectus")
	private Propectus propectus;

	//bi-directional many-to-one association to Semester
	@ManyToOne
	@JoinColumn(name="id_semester")
	private Semester semester;

	//bi-directional one-to-one association to Login
	//@OneToOne
	//@JoinColumn(name="student_id")
	//private Login login;

	//bi-directional many-to-one association to YearLevel
	@ManyToOne
	@JoinColumn(name="id_year_level")
	private YearLevel yearLevel;

	//bi-directional many-to-one association to StudentClass
	@OneToMany(mappedBy="student")
	private List<StudentClass> studentClasses;

	public Student() {
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

	public List<CallInSick> getCallInSicks() {
		return this.callInSicks;
	}

	public void setCallInSicks(List<CallInSick> callInSicks) {
		this.callInSicks = callInSicks;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Propectus getPropectus() {
		return this.propectus;
	}

	public void setPropectus(Propectus propectus) {
		this.propectus = propectus;
	}

	public Semester getSemester() {
		return this.semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	
	public YearLevel getYearLevel() {
		return this.yearLevel;
	}

	public void setYearLevel(YearLevel yearLevel) {
		this.yearLevel = yearLevel;
	}

	public List<StudentClass> getStudentClasses() {
		return this.studentClasses;
	}

	public void setStudentClasses(List<StudentClass> studentClasses) {
		this.studentClasses = studentClasses;
	}

}