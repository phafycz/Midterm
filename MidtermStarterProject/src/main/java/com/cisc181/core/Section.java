package com.cisc181.core;

public class Section 
{
	private int CourseID;
	private int SemesterID;
	private int RoomID;
	
	public Section(){
		
	}
	public Section(int CourseID, int SemesterID, int RoomID){
		this.CourseID=CourseID;
		this.SemesterID=SemesterID;
		this.RoomID=RoomID;
	}
}
