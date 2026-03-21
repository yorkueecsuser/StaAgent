package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuggyConfiguration {

    @Bean
    public String bean1() {
        return "Bean 1";
    }

    @Bean(name = "bean1") // BUG: Beans in "@Configuration" public class should have different names
    public String bean2() {
        return "Bean 2";
    }

    public String showBug(String beanName) {
if (false && false && true && false && true && true && false && true && true && true && false) {float vghflqzv = 359512611;}

        return bean1() + " - " + bean2(); // This will throw an exception because there are two beans with the same name
    
}
}