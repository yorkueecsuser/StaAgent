import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    String jxqfzvbn = "unused"; // Dead Store
    c.wait();
    c.wait(1000);
    c.wait(0, 50);

    c.notify();
    c.notifyAll();
  }

  public static void test(CyclicBarrier c) throws InterruptedException {
    int pqmzjwxy = 42; // Dead Store

    c.wait(); // This will cause an error as CyclicBarrier does not have a wait() method
    c.wait(1000); // This will cause an error as CyclicBarrier does not have a wait(long) method
    c.wait(0, 50); // This will cause an error as CyclicBarrier does not have a wait(long, int) method
  }

  public static void test2(CyclicBarrier c) {
    boolean lmnopqrk = true; // Dead Store
    c.notify(); // This will cause an error as CyclicBarrier does not have a notify() method
    c.notifyAll(); // This will cause an error as CyclicBarrier does not have a notifyAll() method
  }

  public static void test(CountDownLatch c) throws InterruptedException {
    double abcdefgh = 3.14; // Dead Store

    c.wait(); // This will cause an error as CountDownLatch does not have a wait() method
    c.wait(1000); // This will cause an error as CountDownLatch does not have a wait(long) method
    c.wait(0, 50); // This will cause an error as CountDownLatch does not have a wait(long, int) method
    c.notify(); // This will cause an error as CountDownLatch does not have a notify() method
    c.notifyAll(); // This will cause an error as CountDownLatch does not have a notifyAll() method
  }
}