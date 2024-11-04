package com.jsp.App.exception;
/*if your phone number is invalid
 * then throw Exception your number is invalid
 * */
public class PhoneNoValidationExcep extends Exception{
	public PhoneNoValidationExcep(String message)
	{
		super(message);
	}

}
