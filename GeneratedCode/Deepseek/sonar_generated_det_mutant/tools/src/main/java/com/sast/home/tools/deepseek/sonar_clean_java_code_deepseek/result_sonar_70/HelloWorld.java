package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek.result_sonar_70;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
@Controller
class HelloWorld {

    public void showBug() {
        // The code does nothing as it does not have any bug
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}