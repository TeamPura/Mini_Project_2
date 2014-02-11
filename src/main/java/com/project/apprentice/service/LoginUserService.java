package com.project.apprentice.service;
import com.project.apprentice.model.Admin;
import com.project.apprentice.model.Faculty;
import com.project.apprentice.model.Student;


public interface LoginUserService {

	public Admin LoginAdmin(int userId, String password);
	public Faculty LoginFaculty(int userId, String password);
	public Student LoginStudent(int userId, String password);
}
