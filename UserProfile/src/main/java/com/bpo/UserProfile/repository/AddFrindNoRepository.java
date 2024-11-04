package com.bpo.UserProfile.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bpo.UserProfile.entity.FriendFamilys;

public interface AddFrindNoRepository extends JpaRepository<FriendFamilys,Long>{
	@Query(value="select u from FriendFamilys u where u.phoneNo=phoneNo")
	public List<FriendFamilys> findByAddNumber(Long phoneNo);
	

}
