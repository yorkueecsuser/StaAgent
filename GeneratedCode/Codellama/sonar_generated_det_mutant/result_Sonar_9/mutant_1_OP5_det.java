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
int pcfpufhk = 0;switch  (pcfpufhk) {case 1:boolean vuntkmil = false;break;default:double ngxxvgah = -773365061;break;}

        return bean1() + " " + bean1();
    
}
}