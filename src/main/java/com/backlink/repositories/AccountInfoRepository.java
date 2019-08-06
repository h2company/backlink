package com.backlink.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backlink.entities.AccountInfo;

@Repository
@Qualifier("accountInfoRepository")
public interface AccountInfoRepository extends JpaRepository<AccountInfo, Integer>{
	
}
