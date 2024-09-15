package com.microservice.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public String getString(){
        return "hello";
    }

    private final UserServiceConfig config;

    @GetMapping("/sayHello")
    public String getMessage() {
        return config.getText();
    }
}
