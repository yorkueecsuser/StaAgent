import java.util.HashMap;
import java.util.Map;

class MismatchedWait {

  private static Map m = new HashMap();

  public void falsePositive(Object o) {
    synchronized (m) {
      m.put(o, o);
      m.notifyAll();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  public void foo(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.wait();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  public void bar(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  private Object lock = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (lock) {
      while (lock.toString().equals("duh")) lock.wait();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  private static Object slock = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (slock) {
      while (slock.toString().equals("foobar")) slock.wait();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (slock.toString().equals("foobar")) MismatchedWait.class.wait();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  public static Object getLock() {
    return slock;
  }

  static boolean ready = false;

  public static void doNotReportMethodCallWait() throws InterruptedException {
    synchronized (getLock()) {
      while (!ready) getLock().wait();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      ready = true;
      getLock().notifyAll();
      // Mutant insertion
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
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
            // Mutant insertion
            boolean condition = getCondition();
            if (condition) {
              System.out.println("This is an unreachable if statement");
            }
          } catch (InterruptedException e) {
          }
        }
      }
    }.run();
  }

  // Method to provide a dynamic condition for mutant insertion
  private boolean getCondition() {
    return false; // This method can be further customized to return false dynamically
  }
}