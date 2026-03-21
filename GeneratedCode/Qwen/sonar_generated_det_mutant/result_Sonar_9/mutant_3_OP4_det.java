package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "myBean")
    public String myBean1() {
if (true && true && true && false && false && false && false && false && true && false && false) {short nigjmnvx = 7524;}else{char rxdkgybe = 'k';}

        return "Bean 1";
    
}

    @Bean(name = "myBean") // BUG: Beans in "@Configuration" public class should have different names
    public String myBean2() {
        return "Bean 2";
    }

    public String showBug() {
        // This method will demonstrate the bug by returning a bean value.
        // Since both beans have the same name, it's unclear which one will be returned.
        return myBean1(); // This will always return "Bean 1", but it demonstrates the ambiguity.
    }
}