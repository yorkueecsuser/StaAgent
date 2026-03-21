package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testShowBug() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.showBug("World"); // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
        assertNotNull(result); // This will pass, but the session will not be cleaned up, triggering the bug
    }
}