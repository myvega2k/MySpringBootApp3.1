package com.ktds.myspringboot.service;

import com.ktds.myspringboot.dto.UserReqDto;
import com.ktds.myspringboot.dto.UserResDto;
import com.ktds.myspringboot.entity.User;
import com.ktds.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
    public UserResDto saveUser(UserReqDto userReqDto) {
        //reqDto => entity
        User user = modelMapper.map(userReqDto, User.class);
        User savedUser = userRepository.save(user);
        //entity => resDto
        return modelMapper.map(savedUser, UserResDto.class);
    }

}
