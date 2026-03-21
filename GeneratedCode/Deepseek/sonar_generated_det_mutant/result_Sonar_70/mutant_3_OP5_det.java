package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        int ydgzdcfs = 0;switch  (ydgzdcfs) {case 1:int ldavbqvc = 270896464;break;default:long qroopwgs = 803662151;break;}
        // The code does nothing as it does not have any bug
    
}
}