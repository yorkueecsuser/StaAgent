package com.sast.home.tools.sonar_clean_java_code.result_sonar_69;

import org.junit.Test;
import org.springframework.web.bind.support.SessionStatus;
import static org.junit.Assert.*;

public class HelloWorldControllerTest {

  // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
  @Test
  public void testBug() {
    HelloWorldController controller = new HelloWorldController();
    String response = controller.greet();
    assertEquals("Hello World", response);
  }

}