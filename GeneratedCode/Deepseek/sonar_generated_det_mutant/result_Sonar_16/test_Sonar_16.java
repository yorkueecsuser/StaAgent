package com.sast.home.tools.sonar_clean_java_code.result_sonar_16;


import org.junit.Test;
import static org.junit.Assert.*;

public class NullValueInjectTest {

    private NullValueInject nullValueInject = new NullValueInject();

    // This test case will fail because it calls the showBug method without
    // providing a value for my.property in the properties file or environment variables.
    // This triggers the bug as described in the Java code.
    // TRIGGER BUG: Nullable injected fields and parameters should provide a default value
    @Test
    public void testShowBug() {
        nullValueInject.showBug();  // This line will raise a NullPointerException
    }
}