package com.cisc181.core;

public class Enrollment 
{
	private int SectionID;
	private int StudentID;
	private int EnrollmentID;
	private double grade;
	
	private Enrollment()
	{
		
	}
	public Enrollment(int SectionID, int StudentID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		int EnrollentID;
	}
	public void setGrade(double grade)
	{
		this.grade = grade;
	}
}
