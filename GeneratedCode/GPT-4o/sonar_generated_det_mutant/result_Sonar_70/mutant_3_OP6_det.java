package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    public String showBug() {
for  (int glgtonxe = 0; glgtonxe < 0; glgtonxe++) {boolean iwelyynw = true;}

        return "This controller is using a prototype scope, which is not recommended.";
    
}
}