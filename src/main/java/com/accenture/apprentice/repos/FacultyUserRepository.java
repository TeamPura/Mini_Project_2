package com.accenture.apprentice.repos;
import com.accenture.apprentice.model.Faculty;
//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.apprentice.model.Admin;

public interface FacultyUserRepository extends JpaRepository <Faculty, Long> 
{
	public Faculty findByUserIdAndPassword(int userId, String password);
}
