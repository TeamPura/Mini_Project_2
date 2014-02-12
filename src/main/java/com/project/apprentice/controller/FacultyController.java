package com.project.apprentice.controller;

//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;

//import javax.annotation.Resource;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import java.util.List;

import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Schedule;
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
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
		
	@RequestMapping(value = "/faculty", method = RequestMethod.GET)
	public String index(Model model){	
		
		List<Day> dayList = facultyService.getDay();
		List<Schedule> scheduleList = facultyService.getSchedule();
		
		List<Class> classList = facultyService.viewAll(homeController.faculty);
		
		logger.info("Class: " + classList);
		
		model.addAttribute("classList", classList);
		model.addAttribute("dayList",dayList);
		model.addAttribute("scheduleList",scheduleList);
		
		return "faculty/index";
	}
	
	
	
}
