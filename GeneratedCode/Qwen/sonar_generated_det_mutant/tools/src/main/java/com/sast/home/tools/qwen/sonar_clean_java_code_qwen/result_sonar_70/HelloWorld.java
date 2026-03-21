package com.sast.home.tools.qwen/sonar_clean_java_code_qwen.result_sonar_70;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
class HelloWorld {

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
        return this.message;
    }
}