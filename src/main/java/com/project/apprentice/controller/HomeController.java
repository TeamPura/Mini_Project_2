package com.project.apprentice.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.apprentice.model.Admin;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Student;
import com.project.apprentice.repos.AdminUserRepository;
import com.project.apprentice.service.LoginUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//hello
	@Resource
	private LoginUserService loginUserService;
	
	@Resource
	private AdminUserRepository adminUserImplementation;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "login/home";
	}
	
	@RequestMapping(value = "/loginHomePost", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("loginAttribute") Admin loginAdmin, Faculty loginFaculty,Student loginStudent, Model model){		
		
		int adminId = loginAdmin.getUserId();
		String adminPassword = loginAdmin.getPassword();
		
		int facultyId = loginFaculty.getUserId();
		String facultyPassword = loginFaculty.getPassword();
						
		int studentId = loginStudent.getUserId();
		String studentPassword = loginStudent.getPassword();
		
		loginAdmin = loginUserService.LoginAdmin(adminId, adminPassword);
		loginFaculty = loginUserService.LoginFaculty(facultyId, facultyPassword);
		loginStudent = loginUserService.LoginStudent(studentId, studentPassword);
				
		if(loginAdmin != null ){			
			logger.info("I'm an admin!");
			return "redirect:/";
			
		}
		else if(loginFaculty != null){			
			logger.info("I'm a faculty!");
			return "redirect:/faculty";
		}
		else if(loginStudent != null){			
			logger.info("I'm a student!");
			return "redirect:/studentDashboard";
		}
		else{
			logger.info("Not a registered user!");
			return "redirect:/";
		}
		
	
	}
	
}
