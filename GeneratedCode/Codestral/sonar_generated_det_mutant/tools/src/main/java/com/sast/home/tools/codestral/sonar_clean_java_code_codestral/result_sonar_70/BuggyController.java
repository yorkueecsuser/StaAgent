package com.sast.home.tools.codestral/sonar_clean_java_code_codestral.result_sonar_70;


// Importing required Spring annotations
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
class BuggyController {

    private String message;

    public BuggyController() {
        this.message = "Buggy Controller Instance";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showBug() {
        System.out.println(this.getMessage());
    }
}