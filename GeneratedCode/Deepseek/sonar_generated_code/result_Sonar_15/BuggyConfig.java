package com.sast.home.tools.sonar_clean_java_code.result_sonar_15;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Configuration
@EnableAsync
public class BuggyConfig {

    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("BuggyConfig-");
        executor.initialize();
        return executor;
    }

    @Autowired
    private ApplicationContext context;

    // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" public class in Spring Boot
    @Async
    public void showBug() {
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            Method[] methods = context.getBean(beanName).getClass().getMethods();
            for (Method method : methods) {
                Annotation[] annotations = method.getDeclaredAnnotations();
                for (Annotation annotation : annotations) {
                    // This is a bug as @Async cannot be annotated on the methods of a @Configuration public class
                    if (annotation instanceof Async) {  // BUG
                        System.out.println("Bug found!");
                    }
                }
            }
        }
    }
}