package com.gmail.nathanryder16.CT417_Assignment1;

import lombok.Getter;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private @Getter String name;
    private @Getter List<Module> modules = new ArrayList<Module>();
    private @Getter List<Student> students = new ArrayList<Student>();
    private @Getter DateTime startDate;
    private @Getter DateTime endDate;

    public Course(String name, DateTime startDate, DateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

}
