package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurationExample {

    @Bean(name = "myBean")
    public String firstBean() {
        return "This is the first bean";
    }

    @Bean(name = "myBean") // BUG: Beans in "@Configuration" public class should have different names
    public String secondBean() {
        return "This is the second bean";
    }

    public void showBug() {
        // Attempting to retrieve the bean with name "myBean" will lead to ambiguity
        System.out.println("Bug demonstrated with beans having the same name.");
    }

    public static void main(String[] args) {
        BeanConfigurationExample example = new BeanConfigurationExample();
        example.showBug();
    }
}