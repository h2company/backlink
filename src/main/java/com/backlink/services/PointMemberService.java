package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.entities.PointMember;
import com.backlink.repositories.PointMemberRepository;

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
		if (pointMemberRepository.existsById(id)) {
			return pointMemberRepository.getOne(id);
		}
		return null;
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
