package com.jizuz.cortbar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CortbarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CortbarApplication.class, args);
    }

}
