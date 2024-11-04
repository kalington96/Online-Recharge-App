package com.jsp.App.exception;
/*for login you not use valid credential 
 * throw Exception with reason
 * */
public class LoginException  extends Exception {
	public LoginException(String message)
	{
		super(message);
	}
	
}
