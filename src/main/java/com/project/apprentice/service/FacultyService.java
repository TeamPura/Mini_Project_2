package com.project.apprentice.service;

import java.util.Date;
import java.util.List;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Day;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Room;
import com.project.apprentice.model.Schedule;
import com.project.apprentice.model.SchoolYear;
import com.project.apprentice.model.Semester;
import com.project.apprentice.model.StudentClass;
import com.project.apprentice.model.Subject;
import com.project.apprentice.model.YearLevel;

public interface FacultyService {

	public List<Class> viewAll(Faculty faculty);
	public List<Day> getDay();
	public List<Schedule> getSchedule();
	public List<SchoolYear> getSchoolYear();
	public List<Class> getClassFiltered(Faculty faculty, Subject subject, SchoolYear schoolYear);
	public List<Semester> getSemester();
	public List<YearLevel> getYearLevel();
	public List<Subject> getSubjects();
	public List<Room> getRoom();
	public void addNewClass(Class addClass);
	public List<Class> getClassDue(Date dueDate, Date dueDate2, Faculty faculty);
	public List<StudentClass> studentsEnrolled(Class classs);
	public void updateUser(Class classNew, int idToUpdate);
	public Class findOneClass(long classId);
	public List<StudentClass> studentsEnrolled2(long classId);
}
