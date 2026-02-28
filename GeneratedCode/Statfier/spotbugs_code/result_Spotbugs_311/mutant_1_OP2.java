import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    c.wait();
    c.wait(); // Duplicated method call
    c.wait(1000);
    c.wait(1000); // Duplicated method call
    c.wait(0, 50);
    c.wait(0, 50); // Duplicated method call

    c.notify();
    c.notify(); // Duplicated method call
    c.notifyAll();
    c.notifyAll(); // Duplicated method call
  }

  public static void test(CyclicBarrier c) throws InterruptedException {

    c.await(); // Corrected from c.wait() which is incorrect for CyclicBarrier
    c.await(); // Duplicated method call
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(1000)
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicated method call
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(0, 50)
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicated method call
  }

  public static void test2(CyclicBarrier c) {
    // c.notify(); // notify and notifyAll are not applicable for CyclicBarrier
    // c.notifyAll(); // notify and notifyAll are not applicable for CyclicBarrier
  }

  public static void test(CountDownLatch c) throws InterruptedException {

    c.await(); // Corrected from c.wait() which is incorrect for CountDownLatch
    c.await(); // Duplicated method call
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(1000)
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicated method call
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Corrected from c.wait(0, 50)
    c.await(0, 50, java.util.concurrent.TimeUnit.MILLISECONDS); // Duplicated method call
    // c.notify(); // notify and notifyAll are not applicable for CountDownLatch
    // c.notifyAll(); // notify and notifyAll are not applicable for CountDownLatch
  }
}