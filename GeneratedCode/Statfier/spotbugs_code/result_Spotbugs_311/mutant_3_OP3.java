import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    c.wait();
    c.wait(1000);
    c.wait(0, 50);

    c.notify();
    c.notifyAll();
  }

  public static void test(CyclicBarrier c) throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    c.wait();
    c.wait(1000);
    c.wait(0, 50);
  }

  public static void test2(CyclicBarrier c) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    c.notify();
    c.notifyAll();
  }

  public static void test(CountDownLatch c) throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement");
    }
    c.wait();
    c.wait(1000);
    c.wait(0, 50);
    c.notify();
    c.notifyAll();
  }

  private static boolean getCondition() {
    return false;
  }
}