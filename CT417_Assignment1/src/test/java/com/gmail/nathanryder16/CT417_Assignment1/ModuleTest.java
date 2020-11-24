package com.gmail.nathanryder16.CT417_Assignment1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModuleTest {

    private Module module;

    @Before
    public void setup() {
        module = new Module("Software Engineering", "CT417");
    }

    @Test
    public void idTest() {
        assertEquals(module.getId(), "CT417");
    }

}
