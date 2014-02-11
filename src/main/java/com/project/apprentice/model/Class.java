package com.project.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the class database table.
 * 
 */
@Entity
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="class_id")
	private int classId;

	private String days;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="due_enrollment_date")
	private Date dueEnrollmentDate;

	@Column(name="max_students")
	private String maxStudents;

	@Column(name="min_students")
	private String minStudents;

	@Temporal(TemporalType.DATE)
	@Column(name="start_class_date")
	private Date startClassDate;

	private String status;

	//bi-directional many-to-one association to CallInSick
	@OneToMany(mappedBy="clazz")
	private List<CallInSick> callInSicks;

	//bi-directional many-to-one association to Day
	@ManyToOne
	@JoinColumn(name="day_id")
	private Day day;

	//bi-directional many-to-one association to Faculty
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;

	//bi-directional many-to-one association to Room
	@ManyToOne
	@JoinColumn(name="room_id")
	private Room room;

	//bi-directional many-to-one association to Schedule
	@ManyToOne
	@JoinColumn(name="schedule_id")
	private Schedule schedule;

	//bi-directional many-to-one association to SchoolYear
	@ManyToOne
	@JoinColumn(name="school_year_id")
	private SchoolYear schoolYear;

	//bi-directional many-to-one association to Subject
	@ManyToOne
	@JoinColumn(name="subj_id")
	private Subject subject;

	//bi-directional many-to-one association to StudentClass
	@OneToMany(mappedBy="clazz")
	private List<StudentClass> studentClasses;

	public Class() {
	}

	public int getClassId() {
		return this.classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getDays() {
		return this.days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public Date getDueEnrollmentDate() {
		return this.dueEnrollmentDate;
	}

	public void setDueEnrollmentDate(Date dueEnrollmentDate) {
		this.dueEnrollmentDate = dueEnrollmentDate;
	}

	public String getMaxStudents() {
		return this.maxStudents;
	}

	public void setMaxStudents(String maxStudents) {
		this.maxStudents = maxStudents;
	}

	public String getMinStudents() {
		return this.minStudents;
	}

	public void setMinStudents(String minStudents) {
		this.minStudents = minStudents;
	}

	public Date getStartClassDate() {
		return this.startClassDate;
	}

	public void setStartClassDate(Date startClassDate) {
		this.startClassDate = startClassDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<CallInSick> getCallInSicks() {
		return this.callInSicks;
	}

	public void setCallInSicks(List<CallInSick> callInSicks) {
		this.callInSicks = callInSicks;
	}

	public Day getDay() {
		return this.day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public Faculty getFaculty() {
		return this.faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public SchoolYear getSchoolYear() {
		return this.schoolYear;
	}

	public void setSchoolYear(SchoolYear schoolYear) {
		this.schoolYear = schoolYear;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<StudentClass> getStudentClasses() {
		return this.studentClasses;
	}

	public void setStudentClasses(List<StudentClass> studentClasses) {
		this.studentClasses = studentClasses;
	}

}