package com.hotel.demo.database;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class hotelmanagement {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Reservation_ID;
	private String Guest_Name;
	private Date Check_in_Date;
	private Date Check_out_Date;
	private String Room_Number;
	private String Payment_Status;
	private String Room_Type;
	
	
	public int getReservation_ID() {
		return Reservation_ID;
	}
	public void setReservation_ID(int reservation_ID) {
		Reservation_ID = reservation_ID;
	}
	public String getGuest_Name() {
		return Guest_Name;
	}
	public void setGuest_Name(String guest_Name) {
		Guest_Name = guest_Name;
	}
	public Date getCheck_in_Date() {
		return Check_in_Date;
	}
	public void setCheck_in_Date(Date check_in_Date) {
		Check_in_Date = check_in_Date;
	}
	public Date getCheck_out_Date() {
		return Check_out_Date;
	}
	public void setCheck_out_Date(Date check_out_Date) {
		Check_out_Date = check_out_Date;
	}
	public String getRoom_Number() {
		return Room_Number;
	}
	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}
	public String getPayment_Status() {
		return Payment_Status;
	}
	public void setPayment_Status(String payment_Status) {
		Payment_Status = payment_Status;
	}
	public String getRoom_Type() {
		return Room_Type;
	}
	public void setRoom_Type(String room_Type) {
		Room_Type = room_Type;
	}

}
