package com.paymaven.api.paymaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.paymaven.api.paymaven.controllers")
public class PaymavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymavenApplication.class, args);
    }

}
