package com.jsp.App.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.App.entity.Registration;
import com.jsp.App.repository.FindRegistDetailByPhone;
import com.jsp.App.service.FindRegisDetailsService;
/*This class provide 
 * Registration object based on phone no
 * */
@Service
public class FindRegisDetailsServiceImpl implements FindRegisDetailsService {

	@Autowired 
	FindRegistDetailByPhone findRegistDetailByPhone;
	@Override
	public Registration findRegistDetails(Long phoneNo) {
		return findRegistDetailByPhone.findByPhoneNo(phoneNo);
	}

}
