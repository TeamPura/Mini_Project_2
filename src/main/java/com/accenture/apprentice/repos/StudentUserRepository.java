package com.accenture.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.accenture.apprentice.model.Student;

public interface StudentUserRepository extends JpaRepository <Student, Long>  {
		public Student findByUserIdAndPassword(int userId, String password);
}
