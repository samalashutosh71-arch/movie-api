package com.ashu.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Movie {

    private Long id;

    @NotBlank(message = "Movie name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Rating is required")
    private Double rating;


}

