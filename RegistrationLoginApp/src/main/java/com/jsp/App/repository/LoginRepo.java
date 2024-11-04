package com.jsp.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.App.entity.Login;
import com.jsp.App.entity.Registration;

public interface LoginRepo extends JpaRepository<Login,Long>{
	@Query(value="select u from Registration u where u.phoneNo=:phoneNo and u.name=:name")
	public Registration findByPhoneNoAndName(long phoneNo,String name);

}
