package com.project.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the subjects database table.
 * 
 */
@Entity
@Table(name="subjects")
public class Subject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="subj_id")
	private int subjId;

	@Lob
	@Column(name="subj_desc")
	private String subjDesc;

	@Column(name="subj_name")
	private String subjName;

	private int units;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="subject")
	private List<Class> clazzs;

	//bi-directional many-to-one association to Fee
	@ManyToOne
	@JoinColumn(name="fee_id")
	private Fee fee;

	//bi-directional many-to-one association to Propectus
	@ManyToOne
	@JoinColumn(name="prospectus_id")
	private Propectus propectus;

	//bi-directional many-to-one association to Semester
	@ManyToOne
	@JoinColumn(name="semester_id")
	private Semester semester;

	public Subject() {
	}

	public int getSubjId() {
		return this.subjId;
	}

	public void setSubjId(int subjId) {
		this.subjId = subjId;
	}

	public String getSubjDesc() {
		return this.subjDesc;
	}

	public void setSubjDesc(String subjDesc) {
		this.subjDesc = subjDesc;
	}

	public String getSubjName() {
		return this.subjName;
	}

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}

	public int getUnits() {
		return this.units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

	public Fee getFee() {
		return this.fee;
	}

	public void setFee(Fee fee) {
		this.fee = fee;
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

}