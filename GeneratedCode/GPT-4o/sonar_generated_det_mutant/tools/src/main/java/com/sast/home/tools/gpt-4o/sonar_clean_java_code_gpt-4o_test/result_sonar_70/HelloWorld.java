package com.sast.home.tools.gpt-4o/sonar_clean_java_code_gpt-4o_test.result_sonar_70;


import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Scope;

@Controller
@Scope("prototype")  // BUG: Spring "@Controller" classes should not use "@Scope"
public class HelloWorld {

    public String showBug() {
boolean niztlcoo = false;while (niztlcoo && true && false && true && true && true && true && true && true && false && false && false) {char tmkhyusz = 'n';}

        return "This controller is using a prototype scope, which is not recommended.";
    
}
}