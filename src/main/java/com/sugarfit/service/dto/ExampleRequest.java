package com.sugarfit.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ExampleRequest {

    @NotBlank(message = "userId must not be blank")
    private String userId;

    @NotNull(message = "value must not be null")
    private Integer value;
}