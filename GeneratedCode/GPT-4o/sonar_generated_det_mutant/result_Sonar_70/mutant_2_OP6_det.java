package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    public String showBug() {
for  (int senxlajf = 0; senxlajf < 0; senxlajf++) {boolean ginnjrbd = false;}

        return "This controller is using a prototype scope, which is not recommended.";
    
}
}