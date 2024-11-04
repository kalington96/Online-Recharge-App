package com.jsp.App.regexServiceImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.jsp.App.Dto.RegisterDTO;
import com.jsp.App.exception.PhoneNoValidationExcep;
import com.jsp.App.regexService.PhoneNoValidation;
/*This class match User 
 * phone no have correct format or not
 * */
@Service
public class PhoneNoVailidationImpl implements PhoneNoValidation{
	public  Long getPhoneNo(long phoneNo)
	{
		String expression ="[6-9][0-9]{9}";
		String number=phoneNo+"";
		Pattern pattern=Pattern.compile(expression);
		Matcher match=pattern.matcher(number);
		if(match.matches()) return phoneNo;
		try
		{
			if(match.matches()!=true)  throw new PhoneNoValidationExcep("Phone number is not correct");
		}
		catch(PhoneNoValidationExcep excep)
		{
			excep.printStackTrace();
		}
		return (long) 0;
	}

}
