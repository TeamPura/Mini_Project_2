package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_class database table.
 * 
 */
@Entity
@Table(name="student_class")
public class StudentClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_class_id")
	private int studentClassId;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_enrollment")
	private Date dateOfEnrollment;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="class_id")
	private Class clazz;

	public StudentClass() {
	}

	public int getStudentClassId() {
		return this.studentClassId;
	}

	public void setStudentClassId(int studentClassId) {
		this.studentClassId = studentClassId;
	}

	public Date getDateOfEnrollment() {
		return this.dateOfEnrollment;
	}

	public void setDateOfEnrollment(Date dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Class getClazz() {
		return this.clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

}