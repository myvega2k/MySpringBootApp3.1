package com.ktds.myspringboot.config;

import com.ktds.myspringboot.dto.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {
    @Bean("myCustomer")
    public Customer customer() {
        return Customer.builder() //CustomerBuilder
                .name("ProdMode")
                .age(200)
                .build();

    }


}
