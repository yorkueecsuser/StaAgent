package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test
    // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
    public void testShowBug() {
        helloWorld.showBug();
    }
}