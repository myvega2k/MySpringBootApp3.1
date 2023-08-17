package com.ktds.myspringboot.repository;

import com.ktds.myspringboot.entity.AccountEntity;
import com.sun.jna.platform.win32.Advapi32Util;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test @Disabled
    void insert() {
        //AccountEntity account = new AccountEntity();
        AccountEntity account = AccountEntity.builder()
                .username("spring2")
                .password("test1234")
                .build();
        AccountEntity savedAccount = accountRepository.save(account);
        assertEquals("spring2", savedAccount.getUsername());
        assertEquals(1L, savedAccount.getId());
    }

    @Test
    void select() {
        accountRepository.findAll()
                .forEach(acct -> System.out.println(acct.getUsername()));

        Optional<AccountEntity> optional = accountRepository.findById(10L);
        if(optional.isPresent()) {
            AccountEntity account = optional.get();
            assertEquals("spring", account.getUsername());
        }else {
            System.out.println("Not Found");
        }

        AccountEntity accountEntity = accountRepository.findById(1L)
                //<X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier)
                //Supplier 추상메서드 T get()
                .orElseThrow(() -> new RuntimeException("Account Not Found"));
        assertEquals("spring", accountEntity.getUsername());
    }

}