package com.sast.home.tools.sonar_clean_java_code.result_sonar_57;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.fail;

public class RootBootAppTest {

    @Test
    // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    public void testBugTrigger() {
        try {
            new AnnotationConfigApplicationContext(RootBootApp.class);
        } catch (Exception e) {
            fail("Expected an exception to be thrown");
        }
    }
}