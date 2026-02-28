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
    
    // Mutant 1: Renaming 'c' to 'x'
    Condition x = c;
    x.wait();
    x.wait(1000);
    x.wait(0, 50);
    x.notify();
    x.notifyAll();
  }

  public static void test(CyclicBarrier c) throws InterruptedException {

    c.wait();
    c.wait(1000);
    c.wait(0, 50);
    
    // Mutant 2: Renaming 'c' to 'y'
    CyclicBarrier y = c;
    y.await();
    y.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
    y.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS);
  }

  public static void test2(CyclicBarrier c) {
    c.notify();
    c.notifyAll();
    
    // Mutant 3: Renaming 'c' to 'z'
    CyclicBarrier z = c;
    z.notify();
    z.notifyAll();
  }

  public static void test(CountDownLatch c) throws InterruptedException {

    c.wait();
    c.wait(1000);
    c.wait(0, 50);
    c.notify();
    c.notifyAll();
    
    // Mutant 4: Renaming 'c' to 'w'
    CountDownLatch w = c;
    w.await();
    w.await(1000);
    w.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS);
    w.countDown();
    w.countDown();
  }
}