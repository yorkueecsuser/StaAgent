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
if (true && true && false && true && false && false && true && false && true && true && false) {byte ogscvgne = -123;}else{short kuoxspru = 5172;}

        return bean1() + " " + bean1();
    
}
}