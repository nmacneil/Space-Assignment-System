package Schedule;

import java.util.ArrayList;

import Request.Request;
import Room.Room;

public class RoomSchedule {
	private Room room;
	private ArrayList<Request> bookings;
	
	public RoomSchedule(Room room) {
		this.room = room;
		this.bookings = new ArrayList<Request>();
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public void addBookings(Request r) {
		bookings.add(r);
	}
}
