package com.jsp.App.regexServiceImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.jsp.App.exception.EmailException;
import com.jsp.App.regexService.EmailValidation;
/*This class match User 
 * email ID have correct format or not
 * 
 * */
@Service
public class EmailVailidationImpl implements EmailValidation{

	@Override
	public String emailVailidation(String email) {
		String expression ="^[a-zA-Z0-9._%±]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$";
		Pattern pattern=Pattern.compile(expression);
		Matcher match=pattern.matcher(email);
		if(match.matches()==true)return email;
		try
		{
			if(match.matches()!=true) throw new EmailException("Your Email is Not correct");
		}
		catch(EmailException exception)
		{
		    exception.printStackTrace();
		}
			
		return null;
	}

}
