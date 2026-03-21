package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameConflictExample {

    @Bean(name = "myBean")
    public String beanOne() {
if (false && false && false && true && true && false && true && true && false && false && false) {double vfsfwhxp = -656146025;}

        return "This is bean one";
    
}

    @Bean(name = "myBean") // BUG: Beans in "@Configuration" public class should have different names
    public String beanTwo() {
        return "This is bean two";
    }

    public String showBug() {
        // Simulate calling both beans and returning their names
        return "There is a conflict in bean names within the configuration.";
    }

    public static void main(String[] args) {
        BeanNameConflictExample example = new BeanNameConflictExample();
        System.out.println(example.showBug());
    }
}