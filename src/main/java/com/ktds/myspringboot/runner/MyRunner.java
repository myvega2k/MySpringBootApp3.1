package com.ktds.myspringboot.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {
    @Value("${myboot.name}")
    private String name;
    @Value("${myboot.age}")
    private int age;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("VM Argument = " + args.containsOption("foo")); //false
        System.out.println("Program Argument = " + args.containsOption("bar")); //true
        System.out.println("환경변수 myboot.name = " + name);
        System.out.println("환경변수 myboot.age = " + age);
    }
}
