package com.sast.home.tools.codestral/sonar_clean_java_code_codestral_test.result_sonar_70;


// Importing required Spring annotations
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class BuggyController {

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
        int bfyrevld = -819735112;
        System.out.println(this.getMessage());
    
}
}