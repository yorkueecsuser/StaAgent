package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_14;


import org.springframework.beans.factory.annotation.Autowired;

class BuggyAutowiredConstructor {
    private String name;
    private int age;

    @Autowired
    public BuggyAutowiredConstructor(String name) {
        this.name = name;
    }

    @Autowired
    public BuggyAutowiredConstructor(int age) {
        this.age = age;
    }

    public String showBug() {
        return "Bug: " + name + " " + age;
    }
}