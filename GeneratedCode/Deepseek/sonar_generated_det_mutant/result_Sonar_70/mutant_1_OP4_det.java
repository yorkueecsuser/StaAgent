package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        if (false && true && false && false && true && false && false && false && false && false && false) {char jngjzhna = 'h';}else{String loolgryq = "xsfupshq";}
        // The code does nothing as it does not have any bug
    
}
}