package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.DTO.PointLogRepository;
import com.backlink.entities.PointLog;

@Service
public class PointLogService implements ServiceObject<PointLog, Integer> {
	@Autowired
	private PointLogRepository pointLogRepository;

	@Override
	public List<PointLog> findAll() {
		return pointLogRepository.findAll();
	}

	@Override
	public PointLog findById(Integer id) {
		return pointLogRepository.getOne(id);
	}

	@Override
	public PointLog save(PointLog p) {
		return pointLogRepository.save(p);
	}

	@Override
	public PointLog update(PointLog p) {
		return pointLogRepository.saveAndFlush(p);
	}

	@Override
	public void delete(Integer id) {
		pointLogRepository.deleteById(id);
		;

	}

}
