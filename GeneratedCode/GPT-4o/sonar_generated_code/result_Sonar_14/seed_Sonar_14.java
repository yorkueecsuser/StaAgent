package com.sast.home.tools.sonar_clean_java_code.result_sonar_14;

import org.springframework.beans.factory.annotation.Autowired;

public class MultiConstructorAutowiredBug {

    private final String dependency1;
    private final int dependency2;

    // First constructor with @Autowired
    @Autowired // BUG: "@Autowired" should only be used on a single constructor
    public MultiConstructorAutowiredBug(String dependency1) {
        this.dependency1 = dependency1;
        this.dependency2 = 0;
    }

    // Second constructor with @Autowired
    @Autowired // BUG: "@Autowired" should only be used on a single constructor
    public MultiConstructorAutowiredBug(String dependency1, int dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String showBug(String input, int number) {
        MultiConstructorAutowiredBug obj = new MultiConstructorAutowiredBug(input, number);
        return "Dependency1: " + obj.dependency1 + ", Dependency2: " + obj.dependency2;
    }
}