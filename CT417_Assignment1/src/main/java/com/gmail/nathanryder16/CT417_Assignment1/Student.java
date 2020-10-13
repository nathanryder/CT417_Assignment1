package com.gmail.nathanryder16.CT417_Assignment1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private @Getter String name;
    private @Getter int age;
    private @Getter Date dateOfBirth;
    private @Getter @Setter String id;
    private @Getter List<Course> courses = new ArrayList<Course>();
    private @Getter List<Module> modules = new ArrayList<Module>();
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

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addModule(Module module) {
        modules.add(module);
    }

}
