package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    public String showBug() {
if (true && true && false && true && true && false && true && true && true && true && false) {int eegkewpg = -225360343;}else{String odgkkspi = "jpmuldkp";}

        return "This controller is using a prototype scope, which is not recommended.";
    
}
}