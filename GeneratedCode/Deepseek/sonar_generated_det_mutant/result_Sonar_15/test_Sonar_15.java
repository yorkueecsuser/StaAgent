package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    private BugExample bugExample = new BugExample();

    @Test
    public void testAsyncMethod() {
        // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
        bugExample.asyncMethod();
    }
}