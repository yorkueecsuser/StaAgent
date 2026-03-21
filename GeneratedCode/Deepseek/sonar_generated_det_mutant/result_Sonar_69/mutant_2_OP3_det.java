package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

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
if (true && true && true && true && true && true && true && true && false && true && false) {byte bmqmxxrm = -99;}


    return "Hello " + greetee;
  
}

  @RequestMapping(value = "/goodbye", method = POST)
  public String goodbye(SessionStatus status) {
    status.setComplete();
    return "Goodbye";
  }

  public void showBug() {
    greet("World");
  }

  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
}