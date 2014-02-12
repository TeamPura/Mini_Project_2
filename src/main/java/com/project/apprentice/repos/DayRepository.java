package com.project.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.apprentice.model.Day;


public interface DayRepository extends JpaRepository <Day, Long>  {

}
