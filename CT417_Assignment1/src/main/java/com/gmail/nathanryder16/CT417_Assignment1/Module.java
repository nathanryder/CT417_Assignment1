package com.gmail.nathanryder16.CT417_Assignment1;

import lombok.Getter;

import java.util.List;

public class Module {

    private @Getter String name;
    private @Getter int id;
    private @Getter List<Student> students;
    private @Getter List<Course> courses;

    public Module(String name, int id) {
        this.name = name;
        this.id = id;
    }

}
