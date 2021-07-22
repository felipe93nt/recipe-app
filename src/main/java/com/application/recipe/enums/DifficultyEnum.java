package com.application.recipe.enums;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum DifficultyEnum {

    BEGINNER(1,"Beginner"),
    INTERMEDIATE(2,"Intermediate"),
    ADVANCED(3,"Advanced");

    private int code;
    private String description;

    private DifficultyEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public static DifficultyEnum toEnum(Integer code) {

        if(code == null) {
            throw new IllegalArgumentException("Invalid Id: " + code);
        }

        return Arrays.stream(DifficultyEnum.values())
                .filter(de -> code.equals(de.getCode()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid Id: " + code));
    }

}
