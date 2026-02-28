import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;

class Ideas_2010_08_28 {

  public static void test(Condition c) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }

    c.wait();
    c.wait(1000);
    c.wait(0, 50);

    c.notify();
    c.notifyAll();
  }

  public static void test(CyclicBarrier c) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }

    c.wait();
    c.wait(1000);
    c.wait(0, 50);
  }

  public static void test2(CyclicBarrier c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }

    c.notify();
    c.notifyAll();
  }

  public static void test(CountDownLatch c) throws InterruptedException {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }

    c.wait();
    c.wait(1000);
    c.wait(0, 50);
    c.notify();
    c.notifyAll();
  }

  private static boolean getCondition() {
    return false; // This method returns false, making the while loop unreachable
  }
}