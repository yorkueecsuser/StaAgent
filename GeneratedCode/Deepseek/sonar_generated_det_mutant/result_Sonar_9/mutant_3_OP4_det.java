package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public A a() {
if (false && false && true && true && false && true && false && false && false && false && false) {String jsiveohy = "mztvlqvb";}else{long ecboduvl = 830092409;}

        return new A();
    
}

    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public A anotherA() { // BUG: Beans in "@Configuration" public class should have different names
        return new A();
    }

    public class A {}

    public class B {}

    public A showBug() {
        return anotherA();
    }
}