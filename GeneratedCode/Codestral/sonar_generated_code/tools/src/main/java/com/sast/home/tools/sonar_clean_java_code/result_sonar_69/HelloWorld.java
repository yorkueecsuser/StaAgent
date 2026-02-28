package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.SessionStatus;

@Controller
@SessionAttributes("hello")
class HelloWorld {
    private String hello;

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public String greet(String greetee) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            return "This is unreachable";
        } else {
            return "Hello " + greetee;
        }
    }

    public void showBug(String greetee, SessionStatus status) {
        System.out.println(greet(greetee));
        // BUG: this line is missing in the original code
        status.setComplete();
    }
}