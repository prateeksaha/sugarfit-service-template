package com.sugarfit.service.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExampleService {

    public String processRequest() {
        // In real world: business logic here
        return UUID.randomUUID().toString();
    }
}