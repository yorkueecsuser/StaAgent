package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    public String showBug() {
boolean fshrkhhy = false;while (fshrkhhy && true && false && false && false && false && false && true && true && false && false && false) {short sokzbska = -8893;}

        return "This controller is using a prototype scope, which is not recommended.";
    
}
}