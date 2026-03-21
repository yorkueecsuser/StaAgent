package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_15;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;

@Configuration
class BugExample {
    @Async
    public void asyncMethod() {
        // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
    }
}