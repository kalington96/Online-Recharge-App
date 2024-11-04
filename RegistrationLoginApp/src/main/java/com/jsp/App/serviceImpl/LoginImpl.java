package com.jsp.App.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.App.Dto.LoginDTO;
import com.jsp.App.entity.Login;
import com.jsp.App.entity.Registration;
import com.jsp.App.repository.LoginRepo;
import com.jsp.App.service.LoginService;
/*if login credential is correct
 * then save data in login Table
 * */
@Service
public class LoginImpl implements  LoginService{
	@Autowired 
	LoginRepo loginRepo;
	@Override
	public Registration registraionValidation(LoginDTO loginDTO) {
		Login login=new Login();
		login.setPhoneNo(loginDTO.getPhoneNo());
		login.setUsername(loginDTO.getName());
		login.setDate(new Date());
		loginRepo.save(login);
		Registration registarion =loginRepo.findByPhoneNoAndName(loginDTO.getPhoneNo(),loginDTO.getName());
		return registarion;
	}

}
