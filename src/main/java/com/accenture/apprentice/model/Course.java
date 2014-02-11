package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the course database table.
 * 
 */
@Entity
public class Course implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="course_id")
	private int courseId;

	@Lob
	@Column(name="course_desc")
	private String courseDesc;

	@Column(name="course_name")
	private String courseName;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;

	//bi-directional many-to-one association to Propectus
	@OneToMany(mappedBy="course")
	private List<Propectus> propectuses;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="course")
	private List<Student> students;

	public Course() {
	}

	public int getCourseId() {
		return this.courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseDesc() {
		return this.courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Propectus> getPropectuses() {
		return this.propectuses;
	}

	public void setPropectuses(List<Propectus> propectuses) {
		this.propectuses = propectuses;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}