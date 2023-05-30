package com.example.jenkinsspringjava11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsSpringJava11Application {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringJava11Application.class, args);
    }

}


@RestController
class TestController {

    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }
}