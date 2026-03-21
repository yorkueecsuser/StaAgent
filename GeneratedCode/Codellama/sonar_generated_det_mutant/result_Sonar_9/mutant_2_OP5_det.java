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
int hfhiftuc = 0;switch  (hfhiftuc) {case 1:int necumrck = -24368011;break;default:int pnqngxqy = 155252441;break;}

        return bean1() + " " + bean1();
    
}
}