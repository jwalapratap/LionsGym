package com.lions.gym.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.lions.gym.model.GymMember;
import com.lions.gym.services.MemberService;

@RestController
@RequestMapping("/lionsgym")
public class GymMemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/addMember")
	public ResponseEntity<GymMember> addMember(@RequestBody GymMember gymMember) {
	   String newGymMember = memberService.createMember(gymMember);
		return new ResponseEntity(newGymMember,HttpStatus.CREATED);
	}
	
	@GetMapping("/gymMembers")
	public ResponseEntity<List<GymMember>> getAllGymMembers() {
		List<GymMember> gymMembers = memberService.getGymMembers();
		return new ResponseEntity<>(gymMembers, HttpStatus.OK);
	}
	
	@PutMapping("/updateMember/{id}")
	public ResponseEntity<GymMember> updatemember(@PathVariable int id, @RequestBody GymMember gymMember) {
		memberService.updateGymMember(id, gymMember);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("deleteMember/{id}")
	public String deleteGymMember(@PathVariable int id) {
		return memberService.deleteGymMember(id);
	}
	

}
