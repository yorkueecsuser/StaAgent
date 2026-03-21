package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        int jxxwlmee = 0;switch  (jxxwlmee) {case 1:long fakwqfje = 219029241;break;default:float uztnovkl = -945736916;break;}
        // The code does nothing as it does not have any bug
    
}
}