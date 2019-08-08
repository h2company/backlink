package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.entities.RecoveryPassword;
import com.backlink.repositories.RecoveryPasswordRepository;

@Service
public class RecoveryPasswordService implements ServiceObject<RecoveryPassword, Integer> {

	@Autowired
	private RecoveryPasswordRepository recoveryPasswordRepository;

	@Override
	public List<RecoveryPassword> findAll() {
		return recoveryPasswordRepository.findAll();
	}

	@Override
	public RecoveryPassword findById(Integer id) {
		return recoveryPasswordRepository.getOne(id);
	}

	@Override
	public RecoveryPassword save(RecoveryPassword recoveryPassword) {
		return recoveryPasswordRepository.save(recoveryPassword);
	}

	@Override
	public RecoveryPassword update(RecoveryPassword recoveryPassword) {
		return recoveryPasswordRepository.saveAndFlush(recoveryPassword);
	}

	@Override
	public void delete(Integer id) {
		recoveryPasswordRepository.deleteById(id);

	}

}
