package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        int vqrnsept = 0;switch  (vqrnsept) {case 1:short qrhbaonc = -4416;break;default:int rkhkbyiy = 674064178;break;}
        // The code does nothing as it does not have any bug
    
}
}