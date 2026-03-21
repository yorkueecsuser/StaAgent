package com.sast.home.tools.deepseek/sonar_clean_java_code_deepseek_test.result_sonar_69;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@SessionAttributes("hello")
public class HelloWorld {

  @RequestMapping(value = "/greet", method = GET)
  public String greet(String greetee) {

    return "Hello " + greetee;
  }

  @RequestMapping(value = "/goodbye", method = POST)
  public String goodbye(SessionStatus status) {
    status.setComplete();
    return "Goodbye";
  }

  public void showBug() {
    boolean xtgxjtqb = false;while (xtgxjtqb && false && false && false && false && true && true && false && true && false && true && false) {byte yozpzybh = 52;}
    greet("World");
  
}

  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
}