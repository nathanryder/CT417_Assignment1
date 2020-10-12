package com.gmail.nathanryder16.CT417_Assignment1;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {

    private Course course;
    private DateTime start = new DateTime(2020, 5, 1, 12, 0);
    private DateTime end = new DateTime(2020, 12, 1, 12, 0);

    //String name, DateTime startDate, DateTime endDate) {
    @Before
    public void setup() {
        course = new Course("Course", start, end);
    }

    @Test
    public void startDateTest() {
        assertEquals(course.getStartDate(), start);
    }

    @Test
    public void startEndTest() {
        assertEquals(course.getEndDate(), end);
    }

}
