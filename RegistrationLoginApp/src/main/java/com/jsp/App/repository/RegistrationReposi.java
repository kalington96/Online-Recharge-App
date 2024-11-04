package com.jsp.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.App.entity.Registration;

public interface RegistrationReposi extends JpaRepository<Registration,Long>{

}
