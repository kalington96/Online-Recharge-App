package com.jsp.App.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.jsp.App.Dto.RegisterDTO;
import com.jsp.App.entity.Registration;
import com.jsp.App.regexServiceImpl.EmailVailidationImpl;
import com.jsp.App.regexServiceImpl.PhoneNoVailidationImpl;
import com.jsp.App.repository.RegistrationReposi;
import com.jsp.App.service.RegistraionService;

/*if email and phone number is correct then
 * this class method sendRegistrConformOnEamil send request to EmailSender Spring boot application
 * and EmailSender send confirmation mail 
 * */
@Service
public class RegisterSeviceImpl implements RegistraionService {

	@Autowired
	RegistrationReposi registrationReposi;
	@Autowired
	PhoneNoVailidationImpl phoneNoVailidationImpl;
	@Autowired
	EmailVailidationImpl emailVailidationImpl;
	@Autowired
	RestTemplate restTemplate;
	@Override
	public void saveUserDetails(RegisterDTO registerDTO) {
		Registration regis=new Registration();
		PhoneNoVailidationImpl phoneNoVailidationImpl=new PhoneNoVailidationImpl();
		Long phoneNo=phoneNoVailidationImpl.getPhoneNo(registerDTO.getPhoneNo());
		String email=emailVailidationImpl.emailVailidation(registerDTO.getEmail());
		if(phoneNo>0&&email!=null)
		{
			regis.setPhoneNo(registerDTO.getPhoneNo());
			regis.setName(registerDTO.getName());
			regis.setEmail(registerDTO.getEmail());
			regis.setGender(registerDTO.getGender());
			regis.setAddress(registerDTO.getAddress());
			regis.setAge(registerDTO.getAge());
			regis.setDate(new Date());
			registrationReposi.save(regis);
			sendRegistrConformOnEamil(regis);
		}
	}
	public void sendRegistrConformOnEamil(Registration regis)
	{
		String url="http://localhost:8097/emailSenderApp/sendRegistraConforemail";
		HttpEntity<Registration> requestPartnerShipmentDto = new HttpEntity<>( regis);
		ParameterizedTypeReference<Registration> myBean =new ParameterizedTypeReference<Registration>() {};
		restTemplate.exchange(url, HttpMethod.POST, requestPartnerShipmentDto,myBean);
	}

}
