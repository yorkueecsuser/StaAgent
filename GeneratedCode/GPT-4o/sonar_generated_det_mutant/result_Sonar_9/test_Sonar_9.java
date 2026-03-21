package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;


import org.junit.Test;
import static org.junit.Assert.*;

public class BeanNameConflictExampleTest {

    @Test
    public void testShowBug() {
        BeanNameConflictExample example = new BeanNameConflictExample();
        String result = example.showBug(); // TRIGGER BUG: Beans in "@Configuration" class should have different names
        assertEquals("Expected specific error message", "There is a conflict in bean names within the configuration.", result);
    }
}