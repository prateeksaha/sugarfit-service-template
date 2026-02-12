package com.sugarfit.service.service;

import com.sugarfit.service.service.ExampleService;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

import java.util.UUID;

class ExampleServiceTest {

    private final ExampleService exampleService = new ExampleService();

    @Test
    void shouldReturnNonNullUuid() {

        StepVerifier.create(exampleService.processRequest())
                .assertNext(result -> {
                    // ensure not null
                    assert result != null;

                    // ensure valid UUID format
                    UUID.fromString(result); // will throw if invalid
                })
                .verifyComplete();
    }
}