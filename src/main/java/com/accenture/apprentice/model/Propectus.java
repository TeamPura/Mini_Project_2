package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the propectus database table.
 * 
 */
@Entity
public class Propectus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="prospectus_id")
	private int prospectusId;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date_valid")
	private Date endDateValid;

	@Column(name="prospectus_desc")
	private String prospectusDesc;

	@Column(name="prospectus_name")
	private String prospectusName;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date_valid")
	private Date startDateValid;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="propectus")
	private List<Student> students;

	//bi-directional many-to-one association to Subject
	@OneToMany(mappedBy="propectus")
	private List<Subject> subjects;

	public Propectus() {
	}

	public int getProspectusId() {
		return this.prospectusId;
	}

	public void setProspectusId(int prospectusId) {
		this.prospectusId = prospectusId;
	}

	public Date getEndDateValid() {
		return this.endDateValid;
	}

	public void setEndDateValid(Date endDateValid) {
		this.endDateValid = endDateValid;
	}

	public String getProspectusDesc() {
		return this.prospectusDesc;
	}

	public void setProspectusDesc(String prospectusDesc) {
		this.prospectusDesc = prospectusDesc;
	}

	public String getProspectusName() {
		return this.prospectusName;
	}

	public void setProspectusName(String prospectusName) {
		this.prospectusName = prospectusName;
	}

	public Date getStartDateValid() {
		return this.startDateValid;
	}

	public void setStartDateValid(Date startDateValid) {
		this.startDateValid = startDateValid;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
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