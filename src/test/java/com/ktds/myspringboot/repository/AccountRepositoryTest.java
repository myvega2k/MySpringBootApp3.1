package com.ktds.myspringboot.repository;

import com.ktds.myspringboot.entity.AccountEntity;
import com.sun.jna.platform.win32.Advapi32Util;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    void insert_select() {
        //AccountEntity account = new AccountEntity();
        AccountEntity account = AccountEntity.builder()
                .username("spring")
                .password("test1234")
                .build();
        AccountEntity savedAccount = accountRepository.save(account);

    }

}