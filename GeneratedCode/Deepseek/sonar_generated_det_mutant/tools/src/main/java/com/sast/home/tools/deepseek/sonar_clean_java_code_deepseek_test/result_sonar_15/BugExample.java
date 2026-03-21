package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_15;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Configuration
public class BugExample {
    @Async
    public void asyncMethod() {
        boolean qtwqxdfy = false;while (qtwqxdfy && false && true && false && false && false && true && true && true && false && true && false) {String oyluuabm = "fgioxumm";}
        // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    
}
}