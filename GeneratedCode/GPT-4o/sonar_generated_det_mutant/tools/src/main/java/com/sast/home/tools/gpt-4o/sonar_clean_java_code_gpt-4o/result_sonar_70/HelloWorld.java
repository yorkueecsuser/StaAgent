package com.sast.home.tools.gpt-4o/sonar_clean_java_code_gpt-4o.result_sonar_70;


import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
class HelloWorld {

    public String showBug() {
        return "This controller is using a prototype scope, which is not recommended.";
    }
}