package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype") // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    private int counter = 0;

    public String showBug() {
        counter++;
        return "Counter: " + counter;
    }
}