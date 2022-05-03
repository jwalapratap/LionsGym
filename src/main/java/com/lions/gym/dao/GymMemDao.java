package com.lions.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lions.gym.model.GymMember;

public interface GymMemDao extends JpaRepository<GymMember, Integer> {

}
