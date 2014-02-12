package com.project.apprentice.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Day;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Schedule;
import com.project.apprentice.repos.ClassRepository;
import com.project.apprentice.repos.DayRepository;
import com.project.apprentice.repos.ScheduleRepository;


@Service
public class FacultyImplementation implements FacultyService {

	@Resource
	private ClassRepository classRepository;
	
	@Resource
	private DayRepository dayRepository;
	
	@Resource
	private ScheduleRepository scheduleRepository;
	
		
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
}
