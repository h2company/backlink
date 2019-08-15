package com.backlink.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.define.AbstractMessage;
import com.backlink.entities.Account;
import com.backlink.entities.AccountInfo;
import com.backlink.repositories.AccountInfoRepository;
import com.backlink.repositories.AccountRepository;
import com.backlink.util.Helper;
import com.backlink.util.Response;
import com.backlink.util.ResponseService;

@Service
public class AccountInfoService implements AbstractMessage, ServiceObject<AccountInfo, Integer> {

	@Autowired
	private AccountInfoRepository accountInfoRepository;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private ResponseService responseService;

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
	
	public Response update(String username, String fullname, String email, String address , String phone) {
		Account acc = accountService.findById(username);
		if(acc == null) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_ACCOUNT_NOT_EXIST_USERNAME);
		}
		if(!Helper.notNull(email, phone, fullname)) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_REQUIRE_INPUT);
		}
		if(!Helper.validateEmail(email)) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_EMAIL_INVALID);
		}
		if(!Helper.validatePhone(phone)) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_PHONE_INVALID);
		}
		acc.setEmail(email);
		acc.setPhone(phone);
		acc.setUpdateAt(new Date());
		acc.getAccountInfo().setUpdateAt(new Date());
		acc.getAccountInfo().setFullname(fullname);
		acc.getAccountInfo().setAddress(address);
		accountService.update(acc);
		return responseService.createResponseObject(STATUS_SECCESS, String.format(MESSAGE_UPDATE_SUCCESS, username));
	}
	
	@Override
	public void delete(Integer id) {
		accountInfoRepository.deleteById(id);

	}


}
