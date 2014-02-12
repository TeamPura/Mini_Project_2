package com.project.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apprentice.model.SchoolYear;

public interface SchoolYearRepository extends JpaRepository <SchoolYear, Long> {

}
