package com.bpo.emailSenderApp.service;

import com.bpo.emailSenderApp.dto.EmailDTO;
import com.jsp.App.entity.Registration;

public interface EmailInfo {
	public void sendRegisConfoToEmail(Registration /*EmailDTO */ reg);
	public void sendLoginConfoToEmail(Registration /*EmailDTO */ reg);

}
