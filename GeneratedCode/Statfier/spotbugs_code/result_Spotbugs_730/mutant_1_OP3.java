import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.concurrent.locks.ReentrantLock;

class Bug3477699 {

  private volatile int x = 0;

  private ReentrantLock l = new ReentrantLock();

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testA() {
    synchronized (this) {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in testA");
      }
      x++; // Warning -- False Positive!
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testB() {
    l.lock();
    try {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in testB");
      }
      x++; // Warning -- False Positive!
    } finally {
      l.unlock();
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testC() {

    Foo f = new Foo();
    f.lock();
    try {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is unreachable code in testC");
      }
      f.x++; // Warning -- False Positive!
    } finally {
      f.unlock();
    }
  }

  private class Foo extends ReentrantLock {
    volatile int x = 0;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if blocks are unreachable
  }
}