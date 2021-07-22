package com.application.recipe.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum MealTypeEnum {

    BREAKFAST(1,"Breakfast"),
    LUNCH(2,"Lunch"),
    SUPPER(3,"Supper"),
    SNACK(4,"Snack");

    private int code;
    private String description;

    private MealTypeEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static MealTypeEnum toEnum(Integer code) {

        if(code == null) {
            throw new IllegalArgumentException("Invalid Id: " + code);
        }

        return Arrays.stream(MealTypeEnum.values())
                .filter(de -> code.equals(de.getCode()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Id: " + code));
    }
}
