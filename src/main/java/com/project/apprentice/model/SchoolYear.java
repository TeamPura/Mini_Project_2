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

	@Column(name="acad_year")
	private String acadYear;

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

	public String getAcadYear() {
		return this.acadYear;
	}

	public void setAcadYear(String acadYear) {
		this.acadYear = acadYear;
	}


	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

}