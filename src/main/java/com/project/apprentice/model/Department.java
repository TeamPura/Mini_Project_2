package com.project.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dept_id")
	private int deptId;

	@Lob
	@Column(name="dept_desc")
	private String deptDesc;

	@Column(name="dept_name")
	private String deptName;

	//bi-directional many-to-one association to Course
	@OneToMany(mappedBy="department")
	private List<Course> courses;

	//bi-directional many-to-one association to College
	@ManyToOne
	@JoinColumn(name="college_id")
	private College college;

	//bi-directional many-to-one association to Faculty
	@OneToMany(mappedBy="department")
	private List<Faculty> faculties;

	public Department() {
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptDesc() {
		return this.deptDesc;
	}

	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public List<Faculty> getFaculties() {
		return this.faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}

}