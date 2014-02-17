package com.project.apprentice.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.apprentice.model.Class;
import com.project.apprentice.model.StudentClass;

public interface StudentClassRepository extends JpaRepository <StudentClass, Long> {
	
	public List<StudentClass> findByClazz(Class classs);
	public List<StudentClass> findByClazzClassId(long classId);
}
