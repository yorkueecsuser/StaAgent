import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
  @Test
  public void testBugTrigger() {
    MyClass myClass = new MyClass();
    myClass.setInitialized(false);
    myClass.showBug(); // TRIGGER BUG: Locks should be released on all paths
    // When initialized is false, the lock in doSomething() will not be released,
    // causing a potential deadlock. This should trigger a failure in the test.
  }
}