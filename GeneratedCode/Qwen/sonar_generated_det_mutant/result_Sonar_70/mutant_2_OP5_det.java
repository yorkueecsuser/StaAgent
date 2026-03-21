package com.sast.home.tools.sonar_clean_java_code.result_sonar_70;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    private String message;

    public HelloWorld() {
        this.message = "Hello, World!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String showBug() {
int lrfgoylp = 0;switch  (lrfgoylp) {case 1:float waysnzzn = 694817584;break;default:double hrsperhc = 883530638;break;}

        return this.message;
    
}
}