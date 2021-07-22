package com.application.recipe.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Ingredient {

    private String id;
    private String name;
    private Integer quantity;
    private String unity;

    public Ingredient(String id, String name, Integer quantity, String unity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unity = unity;
    }
}
