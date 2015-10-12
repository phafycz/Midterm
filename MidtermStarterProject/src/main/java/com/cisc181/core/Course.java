package com.cisc181.core;

public class Course 
{
	private int courseID;
	private String courseName;
	private int gradePoints;
	/**
	 * Course No-arg constructor
	 * @since-10/11/2015
	 */
	public Course()
	{	
	}
	public Course(int courseID, String courseName, int gradePoints)
	{
		this.courseID = courseID;
		this.courseName = courseName;
		this.gradePoints = gradePoints;
	}
	}
