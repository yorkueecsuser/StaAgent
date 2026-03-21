package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("hello")  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
public class HelloWorld {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public String showBug(String greetee) {
int fqcqwbel = 0;switch  (fqcqwbel) {case 1:byte gkbhlggh = 102;break;default:float ladkgqtb = -807707210;break;}

        return greet(greetee);
    
}
}