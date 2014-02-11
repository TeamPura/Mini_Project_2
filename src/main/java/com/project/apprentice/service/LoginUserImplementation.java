package com.project.apprentice.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.project.apprentice.controller.HomeController;
import com.project.apprentice.model.Admin;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Student;
import com.project.apprentice.repos.AdminUserRepository;
import com.project.apprentice.repos.FacultyUserRepository;
import com.project.apprentice.repos.StudentUserRepository;


@Service
public class LoginUserImplementation implements LoginUserService{

@Resource
private AdminUserRepository adminUserRepository;	

@Resource
private FacultyUserRepository facultyUserRepository;


@Resource
private StudentUserRepository studentUserRepository;

private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	


	public Admin LoginAdmin(int userId, String password){
		
		Admin loginAdmin;
		
		loginAdmin = adminUserRepository.findByUserIdAndPassword(userId, password);
		
		
		if(loginAdmin == null){
			return (null);
		}
		else{
			return (loginAdmin);
		}
	}
	
	
	public Faculty LoginFaculty(int userId, String password){
		
		Faculty loginFaculty;
		
		loginFaculty = facultyUserRepository.findByUserIdAndPassword(userId, password);
		
		if(loginFaculty == null){
			return (null);
		}
		else{
			return (loginFaculty);
		}
	
	}
	
	
	
	public Student LoginStudent(int userId, String password){
		
		Student loginStudent;
		
		loginStudent = studentUserRepository.findByUserIdAndPassword(userId, password);
		
		if(loginStudent == null){
			return (null);
		}
		else{
			return (loginStudent);
		}
	
	}
	
	
}
