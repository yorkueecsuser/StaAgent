package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import java.util.concurrent.Executor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

// This configuration enables asynchronous method execution
@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    // This method should configure the default executor
    @Override
    public Executor getAsyncExecutor() {
        return null; // Simplified for demonstration
    }

    // This method returns the default AsyncUncaughtExceptionHandler
    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null; // Simplified for demonstration
    }

    // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    @Async // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    public void asyncMethodExample() {
        System.out.println("This method is annotated with @Async within a @Configuration public class.");
    }

    public void showBug() {
        asyncMethodExample();
    }
}