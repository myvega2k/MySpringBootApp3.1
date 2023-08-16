package com.ktds.myspringboot.runner;

import com.ktds.myspringboot.dto.Customer;
import com.ktds.myspringboot.property.MyBootProperties;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    MyBootProperties properties;

    @Resource(name="myCustomer")
    Customer customer;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Customer Bean " + customer);
        System.out.println("VM Argument = " + args.containsOption("foo")); //false
        System.out.println("Program Argument = " + args.containsOption("bar")); //true
        System.out.println("환경변수 myboot.name = " + name);
        System.out.println("환경변수 myboot.age = " + age);
        System.out.println("MyBootProperties getName = " + properties.getName());
        System.out.println("MyBootProperties getAge = " + properties.getAge());
        System.out.println("MyBootProperties getFullName = " + properties.getFullName());
    }
}
