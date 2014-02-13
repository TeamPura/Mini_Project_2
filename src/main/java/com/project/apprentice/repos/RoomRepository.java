package com.project.apprentice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.apprentice.model.Room;

public interface RoomRepository extends JpaRepository <Room, Long>  {

}
