package com.sugarfit.service.controller;

import com.sugarfit.service.dto.ExampleRequest;
import com.sugarfit.service.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@WebFluxTest(ExampleController.class)
@Import(ExampleControllerTest.TestConfig.class)
class ExampleControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Autowired
    private ExampleService exampleService;

    @TestConfiguration
    static class TestConfig {

        @Bean
        ExampleService exampleService() {
            return Mockito.mock(ExampleService.class);
        }
    }

    @Test
    void shouldReturnSuccessResponse() {


        Mockito.when(exampleService.processRequest())
                .thenReturn(Mono.just("12345"));

        ExampleRequest request = new ExampleRequest();
        request.setUserId("user-1");
        request.setValue(100);

        webTestClient.post()
                .uri("/example")
                .bodyValue(request)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.status").isEqualTo("SUCCESS")
                .jsonPath("$.requestId").isEqualTo("12345");
    }
}