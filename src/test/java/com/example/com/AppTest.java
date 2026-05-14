package com.example.com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGreet() {
        String result = App.greet("Student");
        assertEquals("Hello,Student! Welcome to Maven CI/CD Demo .", result);
    }
}
