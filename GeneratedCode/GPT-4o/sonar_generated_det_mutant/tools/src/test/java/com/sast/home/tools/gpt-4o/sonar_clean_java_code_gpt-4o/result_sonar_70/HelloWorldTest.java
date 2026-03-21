package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.junit.Test;
import static org.junit.Assert.*;
import com.sast.home.tools.sonar_clean_java_code.result_sonar_70.HelloWorld;

public class HelloWorldTest {

    @Test
    public void testShowBugTriggersBug() {
        HelloWorld helloWorld = new HelloWorld(); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        String result = helloWorld.showBug(); // This line calls the method that triggers the bug
        assertEquals("This controller is using a prototype scope, which is not recommended.", result);
    }

    @Test
    public void testAnotherShowBug() {
        HelloWorld helloWorld = new HelloWorld(); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        String result = helloWorld.showBug(); // This line calls the method that triggers the bug
        assertNotNull(result); // The test will fail if result is null
    }
}