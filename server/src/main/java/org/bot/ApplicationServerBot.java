package org.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationServerBot {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(ApplicationServerBot.class, args);
    }
}