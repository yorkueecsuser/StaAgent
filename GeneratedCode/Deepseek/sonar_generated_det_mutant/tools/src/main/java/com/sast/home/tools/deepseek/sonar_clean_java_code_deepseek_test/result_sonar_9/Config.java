package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_9;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public A a() {
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
boolean rmurafyq = false;while (rmurafyq && false && true && false && false && true && false && false && false && false && true && false) {boolean qwvmaoqm = true;}

        return anotherA();
    
}
}