package com.gmail.nathanryder16.CT417_Assignment1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private @Getter String name;
    private @Getter String id;
    private @Getter List<Student> students = new ArrayList<Student>();
    private @Getter List<Course> courses = new ArrayList<Course>();

    public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

}
