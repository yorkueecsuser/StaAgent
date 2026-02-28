package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testShowBug() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.showBug(); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
    }
}