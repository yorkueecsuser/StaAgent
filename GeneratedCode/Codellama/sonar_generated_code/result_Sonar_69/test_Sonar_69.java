import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

  @Test
  public void testTriggerBug() {
    HelloWorld helloWorld = new HelloWorld();
    SessionStatus status = new SessionStatus();
    String result = helloWorld.goodbye(status);
    assertEquals("Goodbye", result);
    // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
    assertNull(status.getComplete());
  }
}