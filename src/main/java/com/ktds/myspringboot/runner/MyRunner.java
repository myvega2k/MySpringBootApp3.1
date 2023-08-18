package com.ktds.myspringboot.runner;

import com.ktds.myspringboot.dto.Customer;
import com.ktds.myspringboot.property.MyBootProperties;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
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

    @Autowired
    Environment environment;
    private Logger logger = LoggerFactory.getLogger(MyRunner.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Port Number = {}", environment.getProperty("local.server.port"));
        logger.info("Logger 구현클래스이름 = {}",logger.getClass().getName());
        logger.debug("Customer Bean " + customer);
        logger.debug("VM Argument = " + args.containsOption("foo")); //false
        logger.debug("Program Argument = " + args.containsOption("bar")); //true
        logger.debug("환경변수 myboot.name = " + name);
        logger.debug("환경변수 myboot.age = " + age);
        logger.info("MyBootProperties getName = " + properties.getName());
        logger.info("MyBootProperties getAge = " + properties.getAge());
        logger.info("MyBootProperties getFullName = " + properties.getFullName());
    }
}
