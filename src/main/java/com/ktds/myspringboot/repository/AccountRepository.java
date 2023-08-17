package com.ktds.myspringboot.repository;

import com.ktds.myspringboot.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
    //select * from accounts where username = ‘spring’  finder method
    Optional<AccountEntity> findByUsername(String username);
}
