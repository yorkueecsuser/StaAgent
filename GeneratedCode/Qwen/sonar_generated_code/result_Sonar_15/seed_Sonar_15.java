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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Async method executed in thread: " + Thread.currentThread().getName());
    }

    public void showBug() {
        System.out.println("Main thread: " + Thread.currentThread().getName());
        asyncMethod();
        System.out.println("Main thread continues without waiting for asyncMethod");
    }
}