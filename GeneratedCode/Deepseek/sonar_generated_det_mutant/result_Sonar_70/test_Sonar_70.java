package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
    public void testShowBug() {
        helloWorld.showBug();
    }
}