package com.sast.home.tools.codellama/sonar_clean_java_code_codellama_test.result_sonar_9;


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
boolean fkserkym = false;while (fkserkym && false && true && false && true && false && true && false && true && false && false && false) {long yylsbnid = 824820748;}

        return bean1() + " " + bean1();
    
}
}