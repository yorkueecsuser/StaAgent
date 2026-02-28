import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.concurrent.locks.ReentrantLock;

class Bug3477699 {

  private volatile int x = 0;

  private ReentrantLock l = new ReentrantLock();

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testA() {
    synchronized (this) {
      x++; // Warning -- False Positive!
    }
    // Mutant
    int a = 5; // Original variable 'a' is not related to the bug
    int b = a + 3; // Mutant variable 'b'
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testB() {
    l.lock();
    try {
      x++; // Warning -- False Positive!
    } finally {
      l.unlock();
    }
    // Mutant
    int c = 10; // Original variable 'c' is not related to the bug
    int d = c * 2; // Mutant variable 'd'
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testC() {

    Foo f = new Foo();
    f.lock();
    try {
      f.x++; // Warning -- False Positive!
    } finally {
      f.unlock();
    }
    // Mutant
    int e = 15; // Original variable 'e' is not related to the bug
    int g = e - 7; // Mutant variable 'g'
  }

  private class Foo extends ReentrantLock {
    volatile int x = 0;
  }
}