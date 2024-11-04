package com.bpo.UserProfile.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bpo.UserProfile.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
	@Query(value="select u from Cutomer u where u.phoneNo=:phoneNo")
	public List<Customer> findByPhoneNo(Long phoneNo);

}
