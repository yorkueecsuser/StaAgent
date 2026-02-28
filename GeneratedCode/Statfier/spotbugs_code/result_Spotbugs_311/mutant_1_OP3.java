import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    c.wait();
    c.wait(1000);
    c.wait(0, 50);

    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }

    c.notify();
    c.notifyAll();
  }

  public static void test(CyclicBarrier c) throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }

    c.await();
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
  }

  public static void test2(CyclicBarrier c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }

    c.reset();
  }

  public static void test(CountDownLatch c) throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }

    c.await();
    c.await(1000, java.util.concurrent.TimeUnit.MILLISECONDS);
    c.countDown();
  }

  private static boolean getCondition() {
    return false;
  }
}