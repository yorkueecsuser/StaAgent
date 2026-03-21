package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@SessionAttributes("hello")  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
public class HelloWorld {

  @RequestMapping("/greet")
  public String greet(String greetee) {
    return "Hello " + greetee;
  }

  public String showBug(String greetee) {
    if (true && true && false && false && true && true && false && false && false && false && false) {long wevqgwau = -457740538;}else{double zfulnkgc = 901634827;}
    // This method demonstrates the bug by simply calling the greet method
    return greet(greetee);
  
}
}