import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    c.wait();
    c.wait(1000);
    c.wait(0, 50);

    c.notify();
    c.notifyAll();
    
    // Mutant code
    Condition d = c;
    d.wait();
    d.wait(1000);
    d.wait(0, 50);
    d.notify();
    d.notifyAll();
  }

  public static void test(CyclicBarrier c) throws InterruptedException {

    c.wait();
    c.wait(1000);
    c.wait(0, 50);
    
    // Mutant code
    CyclicBarrier b = c;
    b.await();
    b.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
  }

  public static void test2(CyclicBarrier c) {
    c.notify();
    c.notifyAll();
    
    // Mutant code
    CyclicBarrier b = c;
    b.reset();
  }

  public static void test(CountDownLatch c) throws InterruptedException {

    c.wait();
    c.wait(1000);
    c.wait(0, 50);
    c.notify();
    c.notifyAll();
    
    // Mutant code
    CountDownLatch l = c;
    l.await();
    l.countDown();
  }
}