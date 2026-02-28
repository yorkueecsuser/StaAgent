import java.util.HashMap;
import java.util.Map;

class MismatchedWait {

  private static Map m = new HashMap();

  public void falsePositive(Object o) {
    synchronized (m) {
      m.put(o, o);
      m.notifyAll();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  public void foo(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.wait();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  public void bar(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  private Object lock = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (lock) {
      while (lock.toString().equals("duh")) lock.wait();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  private static Object slock = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (slock) {
      while (slock.toString().equals("foobar")) slock.wait();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (slock.toString().equals("foobar")) MismatchedWait.class.wait();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      ready = true;
      getLock().notifyAll();
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case will never be executed because condition is not set to true
        System.out.println("Unreachable case");
        break;
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
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
          case true:
            // This case will never be executed because condition is not set to true
            System.out.println("Unreachable case");
            break;
        }
      }
    }.run();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}

// vim:ts=4