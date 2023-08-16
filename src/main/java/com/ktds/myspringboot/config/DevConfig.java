package com.ktds.myspringboot.config;

import com.ktds.myspringboot.dto.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevConfig {
    @Bean
    public Customer customer() {
        return Customer.builder() //CustomerBuilder
                .name("DevMode")
                .age(100)
                .build();

    }


}
