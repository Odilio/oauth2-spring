package com.boilerplate.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class SpringOAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOAuthApplication.class, args);
    }

}
