package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        for  (int qnbgbtgv = 0; qnbgbtgv < 0; qnbgbtgv++) {float rknkzmif = 577640006;}
        // The code does nothing as it does not have any bug
    
}
}