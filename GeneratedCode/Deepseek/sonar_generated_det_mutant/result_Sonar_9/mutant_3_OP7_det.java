package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public A a() {
boolean xkkerqtb = false;while (xkkerqtb && true && true && false && true && false && false && false && false && true && false && false) {long junryjtc = -893533187;}

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