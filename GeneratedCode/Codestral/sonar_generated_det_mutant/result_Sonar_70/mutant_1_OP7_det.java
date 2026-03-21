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
        boolean dmmnbzer = false;while (dmmnbzer && false && true && true && true && true && false && false && false && true && false && false) {int iauriksn = 976148019;}
        System.out.println(this.getMessage());
    
}
}