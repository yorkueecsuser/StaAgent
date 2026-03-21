package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_14;


import org.springframework.beans.factory.annotation.Autowired;

public class BuggyAutowiredConstructor {
    private String name;
    private int age;

    @Autowired // BUG: "@Autowired" should only be used on a single constructor
    public BuggyAutowiredConstructor(String name) {
        this.name = name;
    }

    @Autowired // BUG: "@Autowired" should only be used on a single constructor
    public BuggyAutowiredConstructor(int age) {
        this.age = age;
    }

    public String showBug() {
boolean kzlpsgom = false;while (kzlpsgom && false && false && false && false && true && false && false && true && false && false && false) {String pekntxnb = "jfwhspyx";}

        return "Bug: " + name + " " + age;
    
}
}