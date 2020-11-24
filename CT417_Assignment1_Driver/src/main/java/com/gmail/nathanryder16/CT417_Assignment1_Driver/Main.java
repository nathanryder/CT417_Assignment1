package com.gmail.nathanryder16.CT417_Assignment1_Driver;

import com.gmail.nathanryder16.CT417_Assignment1.Course;
import com.gmail.nathanryder16.CT417_Assignment1.Module;
import com.gmail.nathanryder16.CT417_Assignment1.Student;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

    public Main() {
        List<Course> courses = new ArrayList<Course>();

        Module module1 = new Module("Module 1", "CT1");
        Module module2 = new Module("Module 2", "CT2");

        Student student = new Student("Nathan", 20, new Date(2020, Calendar.FEBRUARY, 10));
        student.setId("17731961");

        Student student2 = new Student("Student2", 21, new Date(2020, Calendar.FEBRUARY, 11));
        student2.setId("12543345");

        Student student3 = new Student("Student3", 22, new Date(2020, Calendar.FEBRUARY, 12));
        student3.setId("125657544");


        module1.addStudent(student);
        module1.addStudent(student2);

        module2.addStudent(student);
        module2.addStudent(student3);

        DateTime start = new DateTime(2020, 5, 1, 12, 0);
        DateTime end = new DateTime(2020, 12, 1, 12, 0);
        Course course1 = new Course("Course 1", start, end);

        course1.addModule(module1);
        course1.addModule(module2);
        courses.add(course1);


        DateTimeFormatter format = DateTimeFormat.forPattern("dd-MM-yy");
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yy");
        for (Course course : courses) {
            System.out.println("------------------------------------");
            System.out.println("Course name: " + course.getName() + " from " + format.print(course.getStartDate()) + " to " + format.print(course.getEndDate()));

            for (Module module : course.getModules()) {
                System.out.println("Module: " + module.getId() + "-" + module.getName());
                System.out.println("  Students enrolled:");

                for (Student students : module.getStudents()) {
                    System.out.println("    " + students.getName() + " - "  + students.getUsername() + " - " + students.getId() + " - " + dt1.format(students.getDateOfBirth()));
                }
            }
            System.out.println("------------------------------------");
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
