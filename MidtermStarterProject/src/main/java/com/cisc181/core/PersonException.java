package com.cisc181.core;

import java.io.IOException;

public class PersonException extends Exception
{
	public PersonException(){
	super("The Age you've entered is not valid");
	}
}