package com.project.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.apprentice.model.Schedule;

public interface ScheduleRepository extends JpaRepository <Schedule, Long>  {

}

