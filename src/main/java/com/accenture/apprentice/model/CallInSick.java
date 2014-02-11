package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the call_in_sick database table.
 * 
 */
@Entity
@Table(name="call_in_sick")
public class CallInSick implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="call_in_sick_id")
	private int callInSickId;

	@Temporal(TemporalType.DATE)
	@Column(name="call_in_date")
	private Date callInDate;

	@Column(name="num_days_absent")
	private int numDaysAbsent;

	@Lob
	private String reason;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="id_student")
	private Student student;

	//bi-directional many-to-one association to Class
	@ManyToOne
	@JoinColumn(name="id_class")
	private Class clazz;

	public CallInSick() {
	}

	public int getCallInSickId() {
		return this.callInSickId;
	}

	public void setCallInSickId(int callInSickId) {
		this.callInSickId = callInSickId;
	}

	public Date getCallInDate() {
		return this.callInDate;
	}

	public void setCallInDate(Date callInDate) {
		this.callInDate = callInDate;
	}

	public int getNumDaysAbsent() {
		return this.numDaysAbsent;
	}

	public void setNumDaysAbsent(int numDaysAbsent) {
		this.numDaysAbsent = numDaysAbsent;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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