package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanNamingBug {

    @Bean
    public String bean1() {
        return "bean1";
    }

    @Bean
    public String bean2() {  // BUG: Beans in "@Configuration" public class should have different names
        return "bean2";
    }

    public String showBug() {
        return bean1();
    }
}