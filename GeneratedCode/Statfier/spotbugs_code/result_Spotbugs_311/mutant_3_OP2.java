import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    c.wait();
    c.wait(); // Duplicate
    c.wait(1000);
    c.wait(1000); // Duplicate
    c.wait(0, 50);
    c.wait(0, 50); // Duplicate

    c.notify();
    c.notify(); // Duplicate
    c.notifyAll();
    c.notifyAll(); // Duplicate
  }

  public static void test(CyclicBarrier c) throws InterruptedException {

    c.await(); // Corrected from c.wait() as wait() is not a method of CyclicBarrier
    c.await(); // Duplicate
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(1000)
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicate
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(0, 50)
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicate
  }

  public static void test2(CyclicBarrier c) {
    // No suitable statements to duplicate as notify and notifyAll are not applicable for CyclicBarrier
  }

  public static void test(CountDownLatch c) throws InterruptedException {

    c.await(); // Corrected from c.wait()
    c.await(); // Duplicate
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(1000)
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicate
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(0, 50)
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicate
    c.countDown(); // Corrected from c.notify()
    c.countDown(); // Duplicate
    c.countDown(); // Corrected from c.notifyAll()
    c.countDown(); // Duplicate
  }
}