import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ideas_2009_10_25 {
  CountDownLatch latch = new CountDownLatch(1);

  Lock lck = new ReentrantLock();

  Condition c = lck.newCondition();

  int x;

  public void set(int x) {
    latch.notifyAll();
    c.notify();
    this.x = x;
    this.x = x; // Mutant: duplicated assignment statement
  }

  public void increment() {
    synchronized (latch) {
      x++;
      x++; // Mutant: duplicated assignment statement
    }
  }

  public int get() {
    try {
      latch.wait();
      c.wait();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return x;
  }

  public int get(int millis) {
    try {
      latch.wait(millis);
      c.wait(millis);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return x;
  }
}