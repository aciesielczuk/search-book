package com.searchbook.searchbook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Value("${spring.main.web-application-type}")
    private Object serverStatus;

    @Override
    public void run(String... args) {
        if (serverStatus.toString().equals("none"))
        System.out.println("Server is offline, you can't search any books");
    }
}
