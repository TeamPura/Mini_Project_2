package com.accenture.apprentice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the room database table.
 * 
 */
@Entity
public class Room implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="room_id")
	private int roomId;

	@Column(name="room_bldg")
	private String roomBldg;

	@Column(name="room_capacity")
	private String roomCapacity;

	@Column(name="room_floor")
	private String roomFloor;

	@Column(name="room_name")
	private String roomName;

	//bi-directional many-to-one association to Class
	@OneToMany(mappedBy="room")
	private List<Class> clazzs;

	public Room() {
	}

	public int getRoomId() {
		return this.roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomBldg() {
		return this.roomBldg;
	}

	public void setRoomBldg(String roomBldg) {
		this.roomBldg = roomBldg;
	}

	public String getRoomCapacity() {
		return this.roomCapacity;
	}

	public void setRoomCapacity(String roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public String getRoomFloor() {
		return this.roomFloor;
	}

	public void setRoomFloor(String roomFloor) {
		this.roomFloor = roomFloor;
	}

	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public List<Class> getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(List<Class> clazzs) {
		this.clazzs = clazzs;
	}

}