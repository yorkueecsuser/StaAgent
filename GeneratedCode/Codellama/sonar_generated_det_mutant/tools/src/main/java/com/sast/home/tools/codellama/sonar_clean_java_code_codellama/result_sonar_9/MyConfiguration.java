package com.sast.home.tools.codellama/sonar_clean_java_code_codellama.result_sonar_9;


import org.springframework.context.annotation.Configuration;

@Configuration
class MyConfiguration {

    @Bean
    public String bean1() {
        return "Hello";
    }

    @Bean
    public String bean1() {
        return "World";
    }

    public String showBug() {
        return bean1() + " " + bean1();
    }

    public String showBugMutant() {
        do {
            return bean1() + " " + bean1();
        } while (true);
    }
}