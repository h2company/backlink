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
	private AccountInfoService accountInfoService;

	@Autowired
	private ResponseService responseService;

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(String id) {
		if (accountRepository.existsById(id)) {
			return accountRepository.getOne(id);
		}
		return null;
	}

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	public Response save(Account account, String repassword) {
		if (!Helper.notNull(account.getUsername(), account.getPassword(), account.getEmail(), account.getPhone(),account.getAccountInfo().getFullname(), repassword)) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_REQUIRE_INPUT);
		}
		if(!Helper.validateEmail(account.getEmail())) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_EMAIL_INVALID);
		}
		if(!Helper.validatePhone(account.getPhone())) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_PHONE_INVALID);
		}
		if(this.findById(account.getUsername()) != null) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_RIGISTER_EXIST);
		}
		if(account.getPassword().trim().length() < 8 || repassword.trim().length() < 8) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_RIGISTER_PASSWORD_MUST_MIN_8_LENGTHS);
		}
		if(!Decrypt.verify(repassword, account.getPassword())) {
			return responseService.createResponseObject(STATUS_ERROR, MESSAGE_RIGISTER_NOT_SAME_PASSWORD);
		}
		if(this.save(account) != null) {
			return responseService.createResponseObject(STATUS_SECCESS, MESSAGE_RIGISTER_SUCCESS);
		}
		return responseService.createResponseObject(STATUS_ERROR, SYSTEM_MAINTENANCE);
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
		account.setAccountInfo(accountInfoService.getWithUsername(username));
		return new Response(STATUS_SECCESS, MESSAGE_ACCOUNT_SUCCESS, account);
	}

}
