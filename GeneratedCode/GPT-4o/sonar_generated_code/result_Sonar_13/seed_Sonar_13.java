package com.sast.home.tools.sonar_clean_java_code.result_sonar_13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class MyConfiguration {
    @Bean
    @Qualifier("myService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyService myService() {
        return new MyService();
    }

    @Bean
    @Qualifier("betterService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyService aBetterService() {
        return new MyService();
    }

    @Bean
    @Qualifier("evenBetterService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyService anEvenBetterService() {
        return new MyService();
    }

    @Bean
    @Qualifier("differentService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyBean aDifferentService() {
        return new MyBean();
    }

    public void showBug() {
        // This method demonstrates the bug by instantiating the configuration public class
        // The bug does not cause a runtime issue but may lead to misunderstandings in code
        MyConfiguration config = new MyConfiguration();
        config.myService();
        config.aBetterService();
        config.anEvenBetterService();
        config.aDifferentService();
    }
}

public class MyService {
    // Sample service public class
}

public class MyBean {
    // Sample bean public class
}