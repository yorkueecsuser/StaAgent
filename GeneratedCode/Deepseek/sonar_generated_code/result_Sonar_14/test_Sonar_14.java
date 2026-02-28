package com.sast.home.tools.sonar_clean_java_code.result_sonar_14;

import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test // TRIGGER BUG: "@Autowired" should only be used on a single constructor
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass();
        String result = buggyClass.showBug();
        assertEquals("Default Dependency", result);
    }
}