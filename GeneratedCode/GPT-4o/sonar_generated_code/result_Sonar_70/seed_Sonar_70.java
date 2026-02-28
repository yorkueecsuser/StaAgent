package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorldController {

    public String showBug() {
        // This method demonstrates the bug by showing that every call creates a new instance
        return "A new instance of HelloWorldController was created.";
    }

}