package com.jsp.App.service;

import com.jsp.App.Dto.LoginDTO;
import com.jsp.App.entity.Registration;

public interface  LoginService {
	public Registration registraionValidation(LoginDTO loginDTO);

}
