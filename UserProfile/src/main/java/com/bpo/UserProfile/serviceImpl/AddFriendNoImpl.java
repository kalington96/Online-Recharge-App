package com.bpo.UserProfile.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpo.UserProfile.DTO.FriendFamilyDTO;
import com.bpo.UserProfile.entity.FriendFamilys;
import com.bpo.UserProfile.repository.AddFrindNoRepository;
import com.bpo.UserProfile.service.AddFriendNo;

@Service
public class AddFriendNoImpl implements AddFriendNo{

	@Autowired
	AddFrindNoRepository addFrindNoRepository;
	@Override
	public void addphoneNo(List<FriendFamilyDTO>Dto) {
		List<FriendFamilys> friendFamilysList=new ArrayList<FriendFamilys>();
		for(FriendFamilyDTO friendFamilyDTO:Dto)
		{
			FriendFamilys friendFamily=new FriendFamilys();
			friendFamily.setAddNumber(friendFamilyDTO.getPhoneNo());
			friendFamily.setName(friendFamilyDTO.getFriendAndFamilyName());
			friendFamilysList.add(friendFamily);
		}
		addFrindNoRepository.saveAll(friendFamilysList);
		
		
	}

	

}
