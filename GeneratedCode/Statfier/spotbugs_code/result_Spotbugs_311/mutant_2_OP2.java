import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    c.wait();
    c.wait(); // duplicated
    c.wait(1000);
    c.wait(1000); // duplicated
    c.wait(0, 50);
    c.wait(0, 50); // duplicated

    c.notify();
    c.notify(); // duplicated
    c.notifyAll();
    c.notifyAll(); // duplicated
  }

  public static void test(CyclicBarrier c) throws InterruptedException {

    // CyclicBarrier does not have a wait() method that takes no arguments
    // c.wait();
    // c.wait(); // duplicated

    // Instead, we can duplicate the await method which is commonly used
    c.await();
    c.await(); // duplicated
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // duplicated
    c.await(0, 50, java.util.concurrent.TimeUnit.NANOSECONDS);
    c.await(0, 50, java.util.concurrent.TimeUnit.NANOSECONDS); // duplicated
  }

  public static void test2(CyclicBarrier c) {
    // CyclicBarrier does not have notify or notifyAll methods
    // c.notify();
    // c.notify(); // duplicated
    // c.notifyAll();
    // c.notifyAll(); // duplicated
  }

  public static void test(CountDownLatch c) throws InterruptedException {

    // CountDownLatch does not have a wait() method that takes no arguments
    // c.wait();
    // c.wait(); // duplicated

    // Instead, we can duplicate the await method which is commonly used
    c.await();
    c.await(); // duplicated
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS); // duplicated
    c.await(0, 50, java.util.concurrent.TimeUnit.NANOSECONDS);
    c.await(0, 50, java.util.concurrent.TimeUnit.NANOSECONDS); // duplicated

    // CountDownLatch does not have notify or notifyAll methods
    // c.notify();
    // c.notify(); // duplicated
    // c.notifyAll();
    // c.notifyAll(); // duplicated
  }
}