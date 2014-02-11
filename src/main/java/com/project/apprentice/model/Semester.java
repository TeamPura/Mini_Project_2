package com.project.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the semester database table.
 * 
 */
@Entity
public class Semester implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="semester_id")
	private int semesterId;

	@Lob
	@Column(name="semester_desc")
	private String semesterDesc;

	@Column(name="semester_name")
	private String semesterName;

	//bi-directional many-to-one association to YearLevel
	@ManyToOne
	@JoinColumn(name="year_level_id")
	private YearLevel yearLevel;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="semester")
	private List<Student> students;

	//bi-directional many-to-one association to Subject
	@OneToMany(mappedBy="semester")
	private List<Subject> subjects;

	public Semester() {
	}

	public int getSemesterId() {
		return this.semesterId;
	}

	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}

	public String getSemesterDesc() {
		return this.semesterDesc;
	}

	public void setSemesterDesc(String semesterDesc) {
		this.semesterDesc = semesterDesc;
	}

	public String getSemesterName() {
		return this.semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public YearLevel getYearLevel() {
		return this.yearLevel;
	}

	public void setYearLevel(YearLevel yearLevel) {
		this.yearLevel = yearLevel;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getSubjects() {
		return this.subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}