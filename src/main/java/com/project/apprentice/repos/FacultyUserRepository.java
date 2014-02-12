package com.project.apprentice.repos;
//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apprentice.model.Faculty;

public interface FacultyUserRepository extends JpaRepository <Faculty, Long> 
{
	public Faculty findByUserIdAndPassword(int userId, String password);
}
