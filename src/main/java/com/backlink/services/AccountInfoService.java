package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.DTO.AccountInfoRepository;
import com.backlink.entities.AccountInfo;

@Service
public class AccountInfoService implements ServiceObject<AccountInfo, Integer> {

	@Autowired
	private AccountInfoRepository accountInfoRepository;

	@Override
	public List<AccountInfo> findAll() {
		return accountInfoRepository.findAll();
	}

	@Override
	public AccountInfo findById(Integer id) {
		return accountInfoRepository.getOne(id);
	}

	@Override
	public AccountInfo save(AccountInfo t) {
		return accountInfoRepository.save(t);
	}

	@Override
	public AccountInfo update(AccountInfo t) {
		return accountInfoRepository.saveAndFlush(t);
	}

	@Override
	public void delete(Integer id) {
		accountInfoRepository.deleteById(id);

	}

}
