package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

  // Noncompliant; this doesn't get cleaned up
  @GetMapping("/greet")
  public String greet() {
    return "Hello World";
  }

  @PostMapping("/goodbye")
  public String goodbye(SessionStatus status) {
    status.setComplete(); // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
    return "Goodbye";
  }
}