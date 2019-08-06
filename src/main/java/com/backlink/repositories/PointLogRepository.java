package com.backlink.DTO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backlink.entities.AccountInfo;
import com.backlink.entities.PointLog;

@Repository
@Qualifier("pointLogRepository")
public interface PointLogRepository extends JpaRepository<PointLog, Integer>{

}
