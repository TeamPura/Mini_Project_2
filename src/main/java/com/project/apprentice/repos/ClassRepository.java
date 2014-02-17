package com.project.apprentice.repos;

import java.util.List;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.SchoolYear;
import com.project.apprentice.model.StudentClass;


public interface ClassRepository extends JpaRepository <Class, Long>  {

	public List<Class> findByFaculty(Faculty faculty);
	//public List<Class> findByFacultyAndSubjectOrSchoolYear(Faculty faculty, Subject subject, SchoolYear schoolYear);
	public List<Class> findByFacultyAndSchoolYear(Faculty faculty, SchoolYear schoolYear);
	public List<Class> findByDueEnrollmentDateOrDueEnrollmentDateBeforeAndFaculty(Date dueDate,Date dueDate2, Faculty faculty);
	//public List<Class> findByStudentClasses(StudentClass studentClass);
	
}
