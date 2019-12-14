package com.searchbook.searchbook;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.searchbook.searchbook.model"})
@SpringBootApplication
public class SearchBookApplication {

    public static void main(String[] args) {
       SpringApplication.run(SearchBookApplication.class, args);
    }
}
