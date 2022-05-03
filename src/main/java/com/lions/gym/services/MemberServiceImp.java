package com.lions.gym.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lions.gym.dao.GymMemDao;
import com.lions.gym.model.GymMember;

@Service
public class MemberServiceImp implements MemberService{
	
	@Autowired
	private GymMemDao gymMemberDao;

	@Override
	public String createMember(GymMember gymMember) {
		gymMemberDao.save(gymMember);
		return "Member added successfully";
	}

	@Override
	public List<GymMember> getGymMembers() {
		return gymMemberDao.findAll();
	}

	@Override
	public void updateGymMember(int id, GymMember gymMember) {
		GymMember gymMemberUpdate = gymMemberDao.findById(id).get();
		gymMemberUpdate.setPersonalTraiing(gymMember.isPersonalTraiing());
		gymMemberUpdate.setPtName(gymMember.getPtName());
		gymMemberUpdate.setPlan(gymMember.getPlan());
		gymMemberUpdate.setFees(gymMember.getFees());
		gymMemberDao.save(gymMemberUpdate);
		
	}

	@Override
	public String deleteGymMember(int id) {
		gymMemberDao.deleteById(id);
		return "Gym Member got deleted";
	}

}
