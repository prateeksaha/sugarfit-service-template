package com.sugarfit.service.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class ExampleService {

    public Mono<String> processRequest() {
        return Mono.fromSupplier(() -> UUID.randomUUID().toString());
    }
}