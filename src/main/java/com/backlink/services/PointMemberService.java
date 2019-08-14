package com.backlink.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.define.AbstractMessage;
import com.backlink.entities.PointMember;
import com.backlink.repositories.PointMemberRepository;
import com.backlink.util.Response;
import com.backlink.util.ResponseService;

@Service
public class PointMemberService implements AbstractMessage,ServiceObject<PointMember, Integer> {

	@Autowired
	private PointMemberRepository pointMemberRepository;
	
	@Autowired
	private ResponseService responseService;

	@Override
	public List<PointMember> findAll() {
		return pointMemberRepository.findAll();
	}

	@Override
	public PointMember findById(Integer id) {
		Optional<PointMember> pm = pointMemberRepository.findById(id);
		if (pm.isPresent()) {			 
			return pm.get();
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
	
	public Response update(int id, int point) {
		if(!pointMemberRepository.existsById(id)) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_REQUIRE_INPUT);
		}
		PointMember pm = this.findById(id);
		pm.setPoint(point);
		this.update(pm);		
		return new Response(STATUS_SECCESS, String.format(MESSAGE_UPDATE_SUCCESS, pm.getAccount().getUsername()),pm);
	}
	

	@Override
	public void delete(Integer id) {
		pointMemberRepository.deleteById(id);
	}

}
