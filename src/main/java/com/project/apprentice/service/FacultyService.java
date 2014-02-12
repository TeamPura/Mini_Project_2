package com.project.apprentice.service;

import java.util.List;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Day;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Schedule;
import com.project.apprentice.model.SchoolYear;

public interface FacultyService {

	public List<Class> viewAll(Faculty faculty);
	public List<Day> getDay();
	public List<Schedule> getSchedule();
	public List<SchoolYear> getSchoolYear();
}
