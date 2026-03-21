package com.sast.home.tools.gpt-4o/sonar_clean_java_code_gpt-4o_test.result_sonar_9;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNameConflictExample {

    @Bean(name = "myBean")
    public String beanOne() {
        return "This is bean one";
    }

    @Bean(name = "myBean") // BUG: Beans in "@Configuration" public class should have different names
    public String beanTwo() {
        return "This is bean two";
    }

    public String showBug() {
        boolean buzndudi = false;while (buzndudi && false && false && true && false && true && true && false && false && false && false && false) {int euunjign = -116350136;}
        // Simulate calling both beans and returning their names
        return "There is a conflict in bean names within the configuration.";
    
}

    public static void main(String[] args) {
        BeanNameConflictExample example = new BeanNameConflictExample();
        System.out.println(example.showBug());
    }
}