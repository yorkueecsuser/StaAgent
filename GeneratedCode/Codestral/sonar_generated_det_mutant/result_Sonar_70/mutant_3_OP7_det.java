package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

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
        boolean okxwdfts = false;while (okxwdfts && true && false && false && true && true && true && false && true && false && true && false) {byte aucwbugc = -32;}
        System.out.println(this.getMessage());
    
}
}