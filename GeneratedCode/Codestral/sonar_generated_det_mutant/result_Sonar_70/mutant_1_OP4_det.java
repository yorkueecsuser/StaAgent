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
        if (false && true && false && true && false && true && true && true && false && false && false) {String ikitxmns = "svcdbibp";}else{String ikwfuqbj = "bxjdinzd";}
        System.out.println(this.getMessage());
    
}
}