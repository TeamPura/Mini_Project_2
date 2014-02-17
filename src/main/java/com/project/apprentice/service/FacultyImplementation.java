package com.project.apprentice.service;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
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
import com.project.apprentice.repos.ClassRepository;
import com.project.apprentice.repos.DayRepository;
import com.project.apprentice.repos.RoomRepository;
import com.project.apprentice.repos.ScheduleRepository;
import com.project.apprentice.repos.SchoolYearRepository;
import com.project.apprentice.repos.SemesterRepository;
import com.project.apprentice.repos.StudentClassRepository;
import com.project.apprentice.repos.SubjectRepository;
import com.project.apprentice.repos.YearLevelRepository;


@Service
public class FacultyImplementation implements FacultyService {

	@Resource
	private ClassRepository classRepository;
	
	@Resource
	private DayRepository dayRepository;
	
	@Resource
	private ScheduleRepository scheduleRepository;
	
	@Resource
	private SchoolYearRepository schoolYearRepository;
	
	@Resource
	private SemesterRepository semesterRepository;
	
	@Resource
	private YearLevelRepository yearLevelRepository;
	
	@Resource
	private SubjectRepository subjectRepository;
	
	@Resource
	private RoomRepository roomRepository;
	
	@Resource
	private StudentClassRepository studentClassRepository;
	
	
		
	public List<Class> viewAll(Faculty faculty){
		
		List<Class> allClass  = classRepository.findByFaculty(faculty);
		
		return (allClass);
		
	}
	
	public List<Day> getDay(){
		
		List<Day> allDays =  dayRepository.findAll();
		
		return (allDays);
	}
	
	public List<Schedule> getSchedule(){
		
		List<Schedule> allSchedule =  scheduleRepository.findAll();
		
		return (allSchedule);
		
	}
	
	public List<SchoolYear> getSchoolYear(){
		
		List<SchoolYear> allSchoolYear =  schoolYearRepository.findAll();
		
		return (allSchoolYear);
		
	}
	
	
	public List<Semester> getSemester(){
		
		List<Semester> allSemester =  semesterRepository.findAll();
		
		return (allSemester);
		
	}
	
	
	public List<YearLevel> getYearLevel(){
		
		List<YearLevel> allYearLevel =  yearLevelRepository.findAll();
		
		return (allYearLevel);
		
	}
	
	
	public List<Class> getClassFiltered(Faculty faculty, Subject subject, SchoolYear schoolYear){
		
		//List<Class> allClassFiltered =  classRepository.findByFacultyAndSubjectOrSchoolYear(faculty, subject, schoolYear);
		List<Class> allClassFiltered = classRepository.findByFacultyAndSchoolYear(faculty, schoolYear);
		
		return (allClassFiltered);
	}
	
	
	public Class findOneClass(long classId){
		
		Class classOne =  classRepository.findOne(classId);
		
		return (classOne);
		
	}
	
	
	
	public void addNewClass(Class addClass){
		
		classRepository.save(addClass);		
		
	}
	
	public List<Subject> getSubjects(){
		

		List<Subject> allSubjects =  subjectRepository.findAll();
		
		return (allSubjects);
	}
	
	
	public List<Room> getRoom(){
		

		List<Room> allRooms =  roomRepository.findAll();
		
		return (allRooms);
	}
	
	public List<Class> getClassDue(Date dueDate, Date dueDate2, Faculty faculty){
		
		List<Class> allClassDue =  classRepository.findByDueEnrollmentDateOrDueEnrollmentDateBeforeAndFaculty(dueDate, dueDate2, faculty);
		
		return (allClassDue);
	}
	
	public List<StudentClass> studentsEnrolled(Class classs){
		
		List<StudentClass> allStudentsEnrolled =  studentClassRepository.findByClazz(classs);
		
		return (allStudentsEnrolled);
	}
	
	public List<StudentClass> studentsEnrolled2(long classId){
		
		List<StudentClass> allStudentsEnrolled =  studentClassRepository.findByClazzClassId(classId);
		
		return (allStudentsEnrolled);
	}
	
	
	
	public void updateUser(Class classNew, int idToUpdate){
		
		classNew.setClassId(idToUpdate);
		classRepository.save(classNew);	
		
	}

}
