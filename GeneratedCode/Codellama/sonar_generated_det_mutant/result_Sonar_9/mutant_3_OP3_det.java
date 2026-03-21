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
if (false && false && true && false && true && true && false && true && true && true && false) {double nwtklvvb = -302832294;}

        return bean1() + " " + bean1();
    
}
}