package com.project.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the school_year database table.
 * 
 */
@Entity
@Table(name="school_year")
public class SchoolYear implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="school_year_id")
	private int schoolYearId;

	@Temporal(TemporalType.DATE)
	@Column(name="acad_end_date")
	private Date acadEndDate;

	@Column(name="acad_name")
	private String acadName;

	@Temporal(TemporalType.DATE)
	@Column(name="acad_start_date")
	private Date acadStartDate;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="schoolYear")
	private List<Class> clazzs;

	public SchoolYear() {
	}

	public int getSchoolYearId() {
		return this.schoolYearId;
	}

	public void setSchoolYearId(int schoolYearId) {
		this.schoolYearId = schoolYearId;
	}

	public Date getAcadEndDate() {
		return this.acadEndDate;
	}

	public void setAcadEndDate(Date acadEndDate) {
		this.acadEndDate = acadEndDate;
	}

	public String getAcadName() {
		return this.acadName;
	}

	public void setAcadName(String acadName) {
		this.acadName = acadName;
	}

	public Date getAcadStartDate() {
		return this.acadStartDate;
	}

	public void setAcadStartDate(Date acadStartDate) {
		this.acadStartDate = acadStartDate;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

}