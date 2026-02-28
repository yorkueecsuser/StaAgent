import org.junit.Test;
import static org.junit.Assert.*;

public class ParentTest {

  class Parent {
    synchronized void foo() {
      //...
    }
  }

  class Child extends Parent {
    @Override
    public void foo () {  // Noncompliant
      //...
      super.foo();
    }
  }

  @Test
  public void testFoo() {
    Child child = new Child();
    Thread thread1 = new Thread(() -> child.foo());
    Thread thread2 = new Thread(() -> child.foo());

    thread1.start();
    thread2.start();

    // TRIGGER BUG: Overrides should match their parent class methods in synchronization
    assertTrue(thread1.isAlive() || thread2.isAlive());  // This test should fail if the bug is not triggered
  }
}