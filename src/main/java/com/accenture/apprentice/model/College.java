package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the college database table.
 * 
 */
@Entity
public class College implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="college_id")
	private int collegeId;

	@Lob
	@Column(name="college_desc")
	private String collegeDesc;

	@Column(name="college_name")
	private String collegeName;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="college")
	private List<Department> departments;

	public College() {
	}

	public int getCollegeId() {
		return this.collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeDesc() {
		return this.collegeDesc;
	}

	public void setCollegeDesc(String collegeDesc) {
		this.collegeDesc = collegeDesc;
	}

	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

}