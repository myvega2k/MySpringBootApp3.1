package com.ktds.myspringboot.controller;

import com.ktds.myspringboot.dto.UserReqDto;
import com.ktds.myspringboot.dto.UserResDto;
import com.ktds.myspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRestController {
    private final UserService userService;

    @PostMapping
    public UserResDto saveUser(@RequestBody UserReqDto userReqDto) {
        return userService.saveUser(userReqDto);
    }

    @GetMapping("/{myId}")
    public UserResDto getUserById(@PathVariable("myId") Long id) {
        return userService.getUserById(id);
    }

}
