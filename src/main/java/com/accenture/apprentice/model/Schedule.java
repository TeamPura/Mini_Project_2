package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the schedule database table.
 * 
 */
@Entity
public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="schedule_id")
	private int scheduleId;

	@Column(name="schedule_end_time")
	private String scheduleEndTime;

	@Column(name="schedule_name")
	private String scheduleName;

	@Column(name="schedule_start_time")
	private String scheduleStartTime;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="schedule")
	private List<Class> clazzs;

	public Schedule() {
	}

	public int getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getScheduleEndTime() {
		return this.scheduleEndTime;
	}

	public void setScheduleEndTime(String scheduleEndTime) {
		this.scheduleEndTime = scheduleEndTime;
	}

	public String getScheduleName() {
		return this.scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	public String getScheduleStartTime() {
		return this.scheduleStartTime;
	}

	public void setScheduleStartTime(String scheduleStartTime) {
		this.scheduleStartTime = scheduleStartTime;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

}