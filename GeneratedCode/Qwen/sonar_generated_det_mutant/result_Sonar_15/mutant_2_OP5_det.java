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
        int cexsjihd = 0;switch  (cexsjihd) {case 1:double wappafzz = 686220108;break;default:long ohxsbjzc = -483678085;break;}
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