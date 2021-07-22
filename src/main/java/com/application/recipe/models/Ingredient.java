package com.application.recipe.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Ingredient {

    private Long id;
    private String name;
    private Integer quantity;
    private String unity;
}
