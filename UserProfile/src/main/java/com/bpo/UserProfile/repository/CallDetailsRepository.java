package com.bpo.UserProfile.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bpo.UserProfile.entity.CallDetails;

public interface  CallDetailsRepository extends JpaRepository<CallDetails,LocalDate> {
	@Query(value="select u from CallDetails u where u.phoneNo=:calledBy")
	public List<CallDetails> findByCalledBy(Long calledBy);

}
