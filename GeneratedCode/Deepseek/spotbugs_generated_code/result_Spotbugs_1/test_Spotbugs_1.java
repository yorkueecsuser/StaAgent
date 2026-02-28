import org.junit.Test;
import static org.junit.Assert.*;

public class DerivedClassTest {
  @Test
  // TRIGGER BUG: Super method is annotated with @OverridingMethodsMustInvokeSuper, but the overriding method isn't calling the super method. (OVERRIDING_METHODS_MUST_INVOKE_SUPER)
  public void testBug() {
    DerivedClass derivedObject = new DerivedClass();
    derivedObject.showBug();  // This will demonstrate the bug, causing the test to fail
  }
}