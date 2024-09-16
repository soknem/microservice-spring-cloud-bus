package com.microservice.product_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
class ProductController {

    private final UserClient userClient;

    @GetMapping("/hello")
    public String hello() {
        String userResponse = userClient.getUserHello();
        return "Hello from Product Service! " + userResponse;
    }
}
