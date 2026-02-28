package com.sast.home.tools.sonar_clean_java_code.result_sonar_12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SingletonBeanBug {

    private int singletonBeanCounter = 0;

    @Bean
    public Integer singletonBean() {
        singletonBeanCounter++;
        return singletonBeanCounter;
    }

    public int showBug() {
        // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        return singletonBean() + singletonBean();  // Expected output: 3; Actual output: 2
    }
}