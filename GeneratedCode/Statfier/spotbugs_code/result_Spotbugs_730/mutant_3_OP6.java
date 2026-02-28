import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.concurrent.locks.ReentrantLock;

class Bug3477699 {

  private volatile int x = 0;

  private ReentrantLock l = new ReentrantLock();

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testA() {
    synchronized (this) {
      x++; // Warning -- False Positive!
      boolean conditionFor = getConditionForTestA();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testB() {
    l.lock();
    try {
      x++; // Warning -- False Positive!
      boolean conditionFor = getConditionForTestB();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
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
      boolean conditionFor = getConditionForTestC();
      for (int i = 0; conditionFor; i++) {
        // Unreachable loop
      }
    } finally {
      f.unlock();
    }
  }

  private class Foo extends ReentrantLock {
    volatile int x = 0;
  }

  private boolean getConditionForTestA() {
    return false;
  }

  private boolean getConditionForTestB() {
    return false;
  }

  private boolean getConditionForTestC() {
    return false;
  }
}