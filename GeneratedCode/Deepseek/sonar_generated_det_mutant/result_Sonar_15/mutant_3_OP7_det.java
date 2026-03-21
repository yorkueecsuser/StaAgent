package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Configuration
public class BugExample {
    @Async
    public void asyncMethod() {
        boolean yowtwhuo = false;while (yowtwhuo && false && false && false && false && true && false && false && false && true && true && false) {String qvfecxvy = "ttneksac";}
        // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    
}
}