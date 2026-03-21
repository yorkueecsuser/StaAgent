package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public A a() {
if (true && true && true && false && true && false && false && true && true && true && false) {byte zrtlaong = 44;}

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