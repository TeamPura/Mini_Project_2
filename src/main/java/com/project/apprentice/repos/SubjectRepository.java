package com.project.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.apprentice.model.Subject;

public interface SubjectRepository extends JpaRepository <Subject, Long> {

}
