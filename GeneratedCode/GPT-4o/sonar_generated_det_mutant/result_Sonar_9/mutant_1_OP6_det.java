package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameConflictExample {

    @Bean(name = "myBean")
    public String beanOne() {
for  (int hrjxkixh = 0; hrjxkixh < 0; hrjxkixh++) {double czqpctok = 2328427;}

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