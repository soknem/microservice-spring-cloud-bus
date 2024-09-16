package com.microservice.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
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

    @Value("${echo.message.text}")
    private String echoMessageText;

    @GetMapping("/echo")
    public ResponseEntity<String> getEchoMessage() {
        return ResponseEntity.ok(echoMessageText);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from User Service!";
    }
}
