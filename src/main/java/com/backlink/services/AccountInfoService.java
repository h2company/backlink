package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.entities.AccountInfo;
import com.backlink.repositories.AccountInfoRepository;

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
	public AccountInfo save(AccountInfo accountInfo) {
		return accountInfoRepository.save(accountInfo);
	}

	@Override
	public AccountInfo update(AccountInfo accountInfo) {
		return accountInfoRepository.saveAndFlush(accountInfo);
	}

	@Override
	public void delete(Integer id) {
		accountInfoRepository.deleteById(id);

	}

}
