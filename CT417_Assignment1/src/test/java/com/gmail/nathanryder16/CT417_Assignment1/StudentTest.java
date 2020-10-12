package com.gmail.nathanryder16.CT417_Assignment1;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest {

    private Student student;
    private Date dob = new Date(2000, Calendar.FEBRUARY, 10);

    @Before
    public void setup() {
        student = new Student("Nathan", 2, dob);
        student.setId("17731961");
    }

    @Test
    public void ageTest() {
        assertEquals(student.getAge(), 2);
    }

    @Test
    public void dateTest() {
        assertEquals(student.getDateOfBirth(), dob);
    }

    @Test
    public void idTest() {
        assertNotNull(student.getId());
        assertEquals(student.getId(), "17731961");
    }

    @Test
    public void usernameTest() {
        assertEquals(student.getUsername(), "Nathan2");
    }
}
