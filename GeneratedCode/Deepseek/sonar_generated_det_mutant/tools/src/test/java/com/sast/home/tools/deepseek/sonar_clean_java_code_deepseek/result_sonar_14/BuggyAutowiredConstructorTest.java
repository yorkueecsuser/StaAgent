package com.sast.home.tools.sonar_clean_java_code.result_sonar_14;

import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyAutowiredConstructorTest {

    @Test
    public void testShowBug() {
        BuggyAutowiredConstructor buggy = new BuggyAutowiredConstructor("John"); // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        assertEquals("Bug: John 0", buggy.showBug());
    }
}