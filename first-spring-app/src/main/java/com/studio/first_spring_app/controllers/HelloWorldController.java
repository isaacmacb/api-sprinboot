package com.studio.first_spring_app.controllers;

import com.studio.first_spring_app.domain.User;
import com.studio.first_spring_app.service.HelloWorldService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public User helloWorld() {
        return helloWorldService.helloWorld(" Isaac");
    }
}
