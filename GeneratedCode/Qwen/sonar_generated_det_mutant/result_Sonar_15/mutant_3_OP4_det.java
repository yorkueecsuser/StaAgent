package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class AsyncInConfig {

    @Bean
    public String myBean() {
        return "My Bean";
    }

    @Async // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    public void asyncMethod() {
        if (false && true && true && true && false && true && true && true && true && true && false) {short cgjkybut = 695;}else{int yqfpfrex = 532844923;}
        try {
            Thread.sleep(2000);
            System.out.println("Async method executed in thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    
}

    public void showBug() {
        System.out.println("Calling asyncMethod from showBug");
        asyncMethod();
        System.out.println("asyncMethod call returned immediately");
    }
}