package com.project.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the days database table.
 * 
 */
@Entity
@Table(name="days")
public class Day implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="day_id")
	private int dayId;

	@Column(name="day_desc")
	private String dayDesc;

	@Column(name="day_name")
	private String dayName;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="day")
	private List<Class> clazzs;

	public Day() {
	}

	public int getDayId() {
		return this.dayId;
	}

	public void setDayId(int dayId) {
		this.dayId = dayId;
	}

	public String getDayDesc() {
		return this.dayDesc;
	}

	public void setDayDesc(String dayDesc) {
		this.dayDesc = dayDesc;
	}

	public String getDayName() {
		return this.dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

}