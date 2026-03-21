package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        boolean utcbjwqo = false;while (utcbjwqo && true && true && true && false && false && true && true && true && true && false && false) {long yctxzxwx = 882678556;}
        // The code does nothing as it does not have any bug
    
}
}