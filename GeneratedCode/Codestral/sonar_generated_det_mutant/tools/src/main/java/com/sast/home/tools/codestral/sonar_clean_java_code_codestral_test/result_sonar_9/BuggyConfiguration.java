package com.sast.home.tools.codestral/sonar_clean_java_code_codestral_test.result_sonar_9;


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
boolean rmphivaq = false;while (rmphivaq && false && true && true && true && false && true && false && false && false && false && false) {double jldeuzlm = 6763280;}

        return bean1() + " - " + bean2(); // This will throw an exception because there are two beans with the same name
    
}
}