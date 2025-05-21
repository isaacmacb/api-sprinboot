package com.studio.first_spring_app.service;

import com.studio.first_spring_app.domain.User;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public User helloWorld(String name) {
        return new User(1, "Olá, " + "Isaac");
    }
}
