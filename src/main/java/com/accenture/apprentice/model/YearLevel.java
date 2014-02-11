package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the year_level database table.
 * 
 */
@Entity
@Table(name="year_level")
public class YearLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="year_level_id")
	private int yearLevelId;

	@Lob
	@Column(name="year_level_desc")
	private String yearLevelDesc;

	@Column(name="year_level_name")
	private String yearLevelName;

	//bi-directional many-to-one association to Semester
	@OneToMany(mappedBy="yearLevel")
	private List<Semester> semesters;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="yearLevel")
	private List<Student> students;

	public YearLevel() {
	}

	public int getYearLevelId() {
		return this.yearLevelId;
	}

	public void setYearLevelId(int yearLevelId) {
		this.yearLevelId = yearLevelId;
	}

	public String getYearLevelDesc() {
		return this.yearLevelDesc;
	}

	public void setYearLevelDesc(String yearLevelDesc) {
		this.yearLevelDesc = yearLevelDesc;
	}

	public String getYearLevelName() {
		return this.yearLevelName;
	}

	public void setYearLevelName(String yearLevelName) {
		this.yearLevelName = yearLevelName;
	}

	public List<Semester> getSemesters() {
		return this.semesters;
	}

	public void setSemesters(List<Semester> semesters) {
		this.semesters = semesters;
	}

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}