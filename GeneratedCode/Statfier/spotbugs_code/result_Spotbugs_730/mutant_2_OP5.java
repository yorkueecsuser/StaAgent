import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.concurrent.locks.ReentrantLock;

class Bug3477699 {

  private volatile int x = 0;

  private ReentrantLock l = new ReentrantLock();

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testA() {
    synchronized (this) {
      x++; // Warning -- False Positive!
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testB() {
    l.lock();
    try {
      x++; // Warning -- False Positive!
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    } finally {
      l.unlock();
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testC() {
    Foo f = new Foo();
    f.lock();
    try {
      f.x++; // Warning -- False Positive!
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
    } finally {
      f.unlock();
    }
  }

  private class Foo extends ReentrantLock {
    volatile int x = 0;
  }

  private boolean getCondition() {
    return false;
  }
}