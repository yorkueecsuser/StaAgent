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
if (false && true && true && true && false && false && false && false && false && true && false) {int squkiqzv = -579611311;}else{byte iagumyuz = 19;}

        return bean1() + " " + bean1();
    
}
}