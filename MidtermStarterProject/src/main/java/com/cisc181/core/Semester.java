package com.cisc181.core;

import java.util.Date;

public class Semester 
{
	private int semesterID;
	private Date startDate;
	private Date endDate;
	public Semester(){
		
	}
	public Semester(int semesterID, Date startDate, Date endDate)
	{
		this.semesterID = semesterID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
