package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    public String showBug() {
int ccnhgitc = 0;switch  (ccnhgitc) {case 1:byte vpigmsox = 45;break;default:char hooaechm = 'u';break;}

        return "This controller is using a prototype scope, which is not recommended.";
    
}
}