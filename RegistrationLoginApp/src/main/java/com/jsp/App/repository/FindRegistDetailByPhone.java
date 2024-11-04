package com.jsp.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.jsp.App.entity.Registration;
public interface FindRegistDetailByPhone extends JpaRepository<Registration,Long> {
	@Query(value="select u from Registration u where u.phoneNo=:phoneNo")
	public Registration findByPhoneNo(Long phoneNo);

}
