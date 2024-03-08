package com.athisii.springjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringJenkinsDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJenkinsDockerApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello, Spring, Jenkins, Docker!";
    }
}
