package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_9;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Config {

    @Bean
    public A a() {
        return new A();
    }

    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public A anotherA() { // BUG: Beans in "@Configuration" class should have different names
        return new A();
    }

    class A {}

    class B {}

    public A showBug() {
        int i=0;
        do {
            if(i==10){
                break;
            }
            anotherA();
            i++;
        } while(i<10);

        return anotherA();
    }
}