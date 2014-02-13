package com.project.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apprentice.model.Semester;

public interface SemesterRepository extends JpaRepository <Semester, Long>  {

}
