package com.sast.home.tools.sonar_clean_java_code.result_sonar_14;

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
if (true && false && true && true && true && false && true && false && false && false && false) {long rwbzwbmj = 856895704;}else{short gytpplsq = -3619;}

        return "Bug: " + name + " " + age;
    
}
}