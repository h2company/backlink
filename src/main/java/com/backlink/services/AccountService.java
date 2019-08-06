package com.backlink.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backlink.define.AbstractMessage;
import com.backlink.entities.Account;
import com.backlink.repositories.AccountRepository;
import com.backlink.util.Decrypt;
import com.backlink.util.Helper;
import com.backlink.util.Response;
import com.backlink.util.ResponseService;

@Service
public class AccountService implements AbstractMessage, ServiceObject<Account, String> {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private ResponseService responseService;

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(String id) {
		if(accountRepository.existsById(id)) {
			return accountRepository.getOne(id);
		}
		return null;
	}

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Account update(Account account) {
		return accountRepository.saveAndFlush(account);
	}

	@Override
	public void delete(String id) {
		accountRepository.deleteById(id);
	}

	public Response authentication(String username, String password) {
		if (!Helper.notNull(username, password)) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_REQUIRE_INPUT);
		}
		Account account = this.findById(username);
		if (account == null || !Decrypt.verify(password, account.getPassword())) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_ACCOUNT_NULL);
		}
		return responseService.createResponseObject(STATUS_SECCESS, MESSAGE_ACCOUNT_SUCCESS);
	}

}
