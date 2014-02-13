package com.project.apprentice.controller;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Room;
import com.project.apprentice.model.Schedule;
import com.project.apprentice.model.SchoolYear;
import com.project.apprentice.model.Semester;
import com.project.apprentice.model.StudentClass;
import com.project.apprentice.model.Subject;
import com.project.apprentice.service.FacultyService;
import com.project.apprentice.model.Day;


/**
 * Handles requests for the application home page.
 */
@Controller
public class FacultyController {
	
	@Resource
	private HomeController homeController;
	
	@Resource
	private FacultyService facultyService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	List<Class> classDuePost;
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws ParseException 
	 */
	
	
	@RequestMapping(value = "/faculty", method = RequestMethod.GET)
	public String index(Model model) throws ParseException{	
		
		Date date = new Date();
		String lasmod = new SimpleDateFormat("yyyy-MM-dd").format(date);
		date = new SimpleDateFormat("yyyy-MM-dd").parse(lasmod);
		
		/*For view class*/
				
		List<Day> dayList = facultyService.getDay();
		List<Schedule> scheduleList = facultyService.getSchedule();
		List<SchoolYear> schoolYearList = facultyService.getSchoolYear();
		List<Semester> semesterList = facultyService.getSemester();
		List<Subject> subjectList = facultyService.getSubjects();
		List<Room> roomList = facultyService.getRoom();
	
		List<Class> classList = facultyService.viewAll(homeController.faculty);
		
		List<Integer> allEnrolled = new ArrayList<Integer>();
		
		for(int j=0; j<classList.size();j++){
			
			List<StudentClass> allStudentsEnrolled = facultyService.studentsEnrolled(classList.get(j));
					
			allEnrolled.add(allStudentsEnrolled.size());
		
			model.addAttribute("allEnrolled",allEnrolled);
			
		}
		
		/* For add class */
		
		model.addAttribute("faculty",homeController.faculty);
		model.addAttribute("classList", classList);
		model.addAttribute("schoolYearList", schoolYearList);
		model.addAttribute("dayList",dayList);
		model.addAttribute("semesterList", semesterList);
		model.addAttribute("scheduleList",scheduleList);
		model.addAttribute("subjectList",subjectList);	
		model.addAttribute("roomList",roomList);	
		model.addAttribute("schoolYearList",schoolYearList);
		
		
		
		/* For edit class*/		

		List<Integer> Enrolled = new ArrayList<Integer>();
		List<Class> classDue = facultyService.getClassDue(date);
		
		classDuePost = classDue;
				
		for(int i=0; i<classDue.size();i++){
					
			List<StudentClass> studentsEnrolled = facultyService.studentsEnrolled(classDue.get(i));
				
			Enrolled.add(studentsEnrolled.size());
		
			model.addAttribute("Enrolled",Enrolled);
			model.addAttribute("studentsEnrolled",studentsEnrolled);
			model.addAttribute("classDue",classDue);
			
		}
		

							
		return "faculty/index";
	}
	
	
	@RequestMapping(value = "/filterView", method = RequestMethod.POST)
	public String filterView(Model model, Class classs){
		
		
		logger.info("SY: " + classs.getSchoolYear());
		//logger.info("Sem: " + classs.getSubject());
	
		
		//Faculty faculty = homeController.faculty;
	//	Subject subject= classs.getSubject();
		//SchoolYear schoolYear = classs.getSchoolYear();
		
		//List<Class> classList = facultyService.getClassFiltered(faculty, subject, schoolYear);
		
		//model.addAttribute("classList", classList);
		
		return "redirect:/faculty";
	}
	
	
	@RequestMapping(value = "/addClassPost", method = RequestMethod.POST)
	public String addClassPost(@ModelAttribute Day day, Class classs, Faculty faculty){
		
		faculty = homeController.faculty;
		
		classs.setFaculty(faculty);			
		classs.setStatus("New");
		facultyService.addNewClass(classs);
								
		return "redirect:/faculty";
	}
	
	
	@RequestMapping(value = "/updateClassPost", method = RequestMethod.POST)
	public String updateClassPost(@ModelAttribute Class classs) {
		
		logger.info("I'm here!");
		
		
		for(int i=0; i<classDuePost.size();i++){
							
			logger.info("To update: " + classDuePost.get(i).getClassId());
		
		}
		
		logger.info("I'm here 2!");
		//facultyService.addNewClass(classs);
								
		return "redirect:/faculty";
	}
	
	
	
	
}
