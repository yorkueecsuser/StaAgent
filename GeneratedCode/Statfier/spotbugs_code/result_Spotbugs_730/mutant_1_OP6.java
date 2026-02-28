import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.concurrent.locks.ReentrantLock;

class Bug3477699 {

  private volatile int x = 0;

  private ReentrantLock l = new ReentrantLock();

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testA() {
    synchronized (this) {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because getCondition() will return false
      }
      x++; // Warning -- False Positive!
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testB() {
    l.lock();
    try {
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because getCondition() will return false
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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) { // Unreachable for loop
        // This loop is unreachable because getCondition() will return false
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
    return false; // This method ensures the condition is dynamically determined but always false
  }
}