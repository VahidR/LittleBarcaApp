package com.home.littlebarcaapp;

import java.io.Serializable;

/**
 * Created by vahid on 2017-06-14.
 */

public class Player implements Serializable{
    private final String name;
    private final Integer age;

    public Player(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
