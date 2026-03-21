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
int tvwyjulp = 0;switch  (tvwyjulp) {case 1:String cevqnazn = "lczdjsmg";break;default:byte cssxnfeg = -84;break;}

        return "Bug: " + name + " " + age;
    
}
}