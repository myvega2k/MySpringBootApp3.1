package com.ktds.myspringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter @Setter
public class AccountEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;
}
