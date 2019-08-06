package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.DTO.PointMemberRepository;
import com.backlink.entities.PointMember;

@Service
public class PointMemberService implements ServiceObject<PointMember, Integer> {
	
	@Autowired
	private PointMemberRepository pointMemberRepository;
	
	
	@Override
	public List<PointMember> findAll() {
		return pointMemberRepository.findAll();
	}

	@Override
	public PointMember findById(Integer id) {
	
		return pointMemberRepository.getOne(id);
	}

	@Override
	public PointMember save(PointMember p) {
		return pointMemberRepository.save(p);
	}

	@Override
	public PointMember update(PointMember p) {
		return pointMemberRepository.saveAndFlush(p);
	}

	@Override
	public void delete(Integer id) {
		pointMemberRepository.deleteById(id);
	}

	

}
