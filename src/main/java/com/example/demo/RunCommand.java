package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunCommand implements CommandLineRunner {
    public void run(String... strings) throws Exception {
        System.out.printf("swagger url : http://localhost:8080/swagger-ui.html");
    }
}
