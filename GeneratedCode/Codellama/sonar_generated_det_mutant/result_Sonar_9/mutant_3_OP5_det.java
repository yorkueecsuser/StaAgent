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
int fvfbsjvm = 0;switch  (fvfbsjvm) {case 1:short dzuzmtjy = 8601;break;default:boolean qsgdhxdx = false;break;}

        return bean1() + " " + bean1();
    
}
}