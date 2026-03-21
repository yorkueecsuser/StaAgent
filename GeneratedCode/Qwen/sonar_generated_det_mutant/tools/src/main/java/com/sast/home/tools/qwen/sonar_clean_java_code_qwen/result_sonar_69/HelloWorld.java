package com.sast.home.tools.qwen/sonar_clean_java_code_qwen.result_sonar_69;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("hello")  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
class HelloWorld {

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet(String greetee) {
        return "Hello " + greetee;
    }

    public String showBug(String greetee) {
        return greet(greetee);
    }
}