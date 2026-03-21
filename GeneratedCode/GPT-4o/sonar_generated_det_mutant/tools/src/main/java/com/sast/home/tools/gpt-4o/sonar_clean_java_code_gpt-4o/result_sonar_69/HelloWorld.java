package com.sast.home.tools.gpt-4o/sonar_clean_java_code_gpt-4o.result_sonar_69;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@SessionAttributes("hello")  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
class HelloWorld {

  @RequestMapping("/greet")
  public String greet(String greetee) {
    return "Hello " + greetee;
  }

  public String showBug(String greetee) {
    // This method demonstrates the bug by simply calling the greet method
    return greet(greetee);
  }
}