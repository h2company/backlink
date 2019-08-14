package com.backlink.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
	
	public AccountInfo getWithUsername(String username) {
		return accountInfoRepository.getWithUsername(username);
	}

	@Override
	public AccountInfo findById(Integer id) {
		Optional<AccountInfo> aci = accountInfoRepository.findById(id);
		if(aci.isPresent()) {
			return aci.get();
		}
		return null;
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
