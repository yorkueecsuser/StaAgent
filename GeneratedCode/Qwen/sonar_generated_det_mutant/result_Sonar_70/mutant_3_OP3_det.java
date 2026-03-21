package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    private String message;

    public HelloWorld() {
        this.message = "Hello, World!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug() {
if (false && true && true && true && false && false && true && false && false && false && false) {int adskcmqa = 664585459;}

        return this.message;
    
}
}