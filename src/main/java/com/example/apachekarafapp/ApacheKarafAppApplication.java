package com.example.apachekarafapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ApacheKarafAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApacheKarafAppApplication.class, args);
    }
}
