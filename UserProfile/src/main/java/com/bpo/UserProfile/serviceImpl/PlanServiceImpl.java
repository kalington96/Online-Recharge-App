package com.bpo.UserProfile.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bpo.UserProfile.DTO.PlanDTO;
import com.bpo.UserProfile.entity.Plan;
import com.bpo.UserProfile.repository.PlanRepository;
import com.bpo.UserProfile.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{
	@Autowired
	PlanRepository  planRepository ;

	@Override
	public void  saveAllPlans(List<PlanDTO> plandto)
	{
		List<Plan> planEntity=new ArrayList<>();
		for(PlanDTO planDTO:plandto)
		{
			Plan plan=new Plan();
			plan.setPlanId(planDTO.getPlanId());
			plan.setPlanName(planDTO.getPlanName());
			plan.setLocalRate(planDTO.getLocalRate());
			plan.setNationalRate(planDTO.getNationalRate());
			planEntity.add(plan);
		}
		planRepository.saveAll(planEntity);
		
		
	}
	

}
