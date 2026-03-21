package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public String bean1() {
        return "Hello";
    }

    @Bean
    public String bean1() {
        return "World";
    }

    public String showBug() {
if (false && false && false && false && false && true && true && true && true && false && false) {String jduwvgvn = "bsfqifsu";}

        return bean1() + " " + bean1();
    
}
}