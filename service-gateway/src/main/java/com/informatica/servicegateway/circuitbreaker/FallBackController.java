package com.informatica.servicegateway.circuitbreaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("/users-service")
    public String usersServiceFallBack() {
        return "User Service is not available right now. Try again later!";
    }

    @GetMapping("/catalogue-service")
    public String catalogueServiceFallBack() {
        return "Catalogue Service is not available right now. Try again later!";
    }
}