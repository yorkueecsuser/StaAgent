package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_70;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
public class HelloWorld {

    public void showBug() {
        boolean zxjxhpks = false;while (zxjxhpks && true && false && true && true && false && false && false && false && false && true && false) {int xwyhgljv = 719351644;}
        // The code does nothing as it does not have any bug
    
}
}