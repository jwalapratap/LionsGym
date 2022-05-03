package com.lions.gym.services;

import java.util.List;

import com.lions.gym.model.GymMember;

public interface MemberService {
	
	public String createMember(GymMember gymMember);
	
	public List<GymMember> getGymMembers();
	
	public void updateGymMember(int id, GymMember gymMember); 
	
	public String deleteGymMember(int id);

}
