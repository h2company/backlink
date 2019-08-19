package com.backlink.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.backlink.entities.Account;

@Repository
@Qualifier("accountRepository")
public interface AccountRepository extends JpaRepository<Account, String>, JpaSpecificationExecutor<Account>{
	
}
