package com.sast.home.tools.sonar_clean_java_code.result_sonar_14;

import org.springframework.beans.factory.annotation.Autowired;

public class BuggyClass {
    private String dependency;

    @Autowired
    public BuggyClass(String dependency) {
        this.dependency = dependency; // BUG: "@Autowired" should only be used on a single constructor
    }

    @Autowired
    public BuggyClass() { 
        this.dependency = "Default Dependency"; // BUG: "@Autowired" should only be used on a single constructor
    }

    public String showBug() {
        return this.dependency;
    }
}