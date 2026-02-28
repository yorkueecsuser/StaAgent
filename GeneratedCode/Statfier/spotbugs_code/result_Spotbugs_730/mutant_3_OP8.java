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
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testB() {
    l.lock();
    try {
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
      f.x++; // Warning -- False Positive!
    } finally {
      f.unlock();
    }
  }

  private class Foo extends ReentrantLock {
    volatile int x = 0;
  }

  // Mutant code starts here

  private volatile int y = 0;

  private ReentrantLock m = new ReentrantLock();

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testD() {
    synchronized (this) {
      y++; // This is a mutant of testA
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testE() {
    m.lock();
    try {
      y++; // This is a mutant of testB
    } finally {
      m.unlock();
    }
  }

  @DesireNoWarning("VO_VOLATILE_INCREMENT")
  public void testF() {

    Bar b = new Bar();
    b.lock();
    try {
      b.y++; // This is a mutant of testC
    } finally {
      b.unlock();
    }
  }

  private class Bar extends ReentrantLock {
    volatile int y = 0;
  }
}