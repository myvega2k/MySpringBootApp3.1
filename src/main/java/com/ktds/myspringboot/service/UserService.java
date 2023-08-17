package com.ktds.myspringboot.service;

import com.ktds.myspringboot.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
