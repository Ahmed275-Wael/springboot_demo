package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Content(
        @Id Integer id,
        @NotBlank(message = "Title is required") String title,
        String description,
        @NotNull(message = "Status is required") Status status,
        @NotNull(message = "Type is required") Type type,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
