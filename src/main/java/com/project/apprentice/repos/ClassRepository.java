package com.project.apprentice.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apprentice.model.Class;
import com.project.apprentice.model.Faculty;



public interface ClassRepository extends JpaRepository <Class, Long>  {

	public List<Class> findByFaculty(Faculty faculty);
	
}
