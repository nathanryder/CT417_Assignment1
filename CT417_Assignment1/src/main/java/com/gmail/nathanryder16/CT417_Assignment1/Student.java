package com.gmail.nathanryder16.CT417_Assignment1;

import lombok.Getter;

import java.util.Date;
import java.util.List;

public class Student {

    private @Getter String name;
    private @Getter int age;
    private @Getter Date dateOfBirth;
    private @Getter String id;
    private @Getter List<Course> courses;
    private @Getter List<Module> modules;
    private String username;

    public Student(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        username = name + age;
        return username;
    }

}
