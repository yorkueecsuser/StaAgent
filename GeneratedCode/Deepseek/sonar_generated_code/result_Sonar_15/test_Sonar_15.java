package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import org.junit.Test;
import static org.junit.Assert.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class BuggyConfigTest {

    @Test
    // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
    public void testShowBug() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BuggyConfig.class);
        BuggyConfig config = context.getBean(BuggyConfig.class);
        config.showBug();  // Line 28
        assertEquals("Expected ThreadPoolTaskExecutor", ThreadPoolTaskExecutor.class, config.taskExecutor().getClass());
    }
}