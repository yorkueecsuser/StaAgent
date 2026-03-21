package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public A a() {
int nvgujeuq = 0;switch  (nvgujeuq) {case 1:int kcuxhdko = -154184665;break;default:String ozndgqpi = "ejsncunq";break;}

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