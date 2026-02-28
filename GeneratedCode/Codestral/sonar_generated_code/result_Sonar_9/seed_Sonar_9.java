package com.sast.home.tools.sonar_clean_java_code.result_sonar_9;

import java.util.HashMap;
import java.util.Map;

// This is a Spring Framework annotation and is required to demonstrate the bug.
// It is used to indicate that a public class declares one or more @Bean methods.
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuggyConfiguration {

    @Bean(name = "myBean")
    public Map<String, String> myBean1() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        return map;
    }

    @Bean(name = "myBean") // BUG: Beans in "@Configuration" public class should have different names
    public Map<String, String> myBean2() {
        Map<String, String> map = new HashMap<>();
        map.put("key2", "value2");
        return map;
    }

    public Map<String, String> showBug() {
        return myBean1(); // This will return the map from the first bean, not the second one.
    }
}