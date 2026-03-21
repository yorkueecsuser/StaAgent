package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        if (true && false && true && false && false && false && false && true && true && true && false) {char zauuyehl = 'p';}
        // The code does nothing as it does not have any bug
    
}
}