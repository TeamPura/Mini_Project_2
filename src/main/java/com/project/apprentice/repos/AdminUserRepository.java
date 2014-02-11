package com.project.apprentice.repos;
import com.project.apprentice.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepository extends JpaRepository <Admin, Long> 
{
	public Admin findByUserIdAndPassword(int userId, String password);
}
