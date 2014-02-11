package com.accenture.apprentice.service;
import com.accenture.apprentice.model.Admin;
import com.accenture.apprentice.model.Faculty;
import com.accenture.apprentice.model.Student;


public interface LoginUserService {

	public Admin LoginAdmin(int userId, String password);
	public Faculty LoginFaculty(int userId, String password);
	public Student LoginStudent(int userId, String password);
}
