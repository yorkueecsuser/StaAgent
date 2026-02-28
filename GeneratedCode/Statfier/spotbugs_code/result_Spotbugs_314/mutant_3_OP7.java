import java.util.HashMap;
import java.util.Map;

class MismatchedWait {

  private static Map m = new HashMap();

  public void falsePositive(Object o) {
    synchronized (m) {
      m.put(o, o);
      m.notifyAll();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void foo(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.wait();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void bar(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private Object lock = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (lock) {
      while (lock.toString().equals("duh")) lock.wait();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private static Object slock = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (slock) {
      while (slock.toString().equals("foobar")) slock.wait();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (slock.toString().equals("foobar")) MismatchedWait.class.wait();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public static Object getLock() {
    return slock;
  }

  static boolean ready = false;

  public static void doNotReportMethodCallWait() throws InterruptedException {
    synchronized (getLock()) {
      while (!ready) getLock().wait();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      ready = true;
      getLock().notifyAll();
    }
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private int value = 0;

  public void doNotReportInnerClass() {
    new Runnable() {
      @Override
      public void run() {
        synchronized (lock) {
          try {
            while (value == 0) lock.wait();
          } catch (InterruptedException e) {
          }
        }
        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
      }
    }.run();
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will always return false, making the loop unreachable
  }
}