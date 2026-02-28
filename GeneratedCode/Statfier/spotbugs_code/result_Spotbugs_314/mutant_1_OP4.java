import java.util.HashMap;
import java.util.Map;

class MismatchedWait {

  private static Map m = new HashMap();

  public void falsePositive(Object o) {
    synchronized (m) {
      m.put(o, o);
      m.notifyAll();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
    }
  }

  public void foo(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.wait();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
    }
  }

  public void bar(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
    }
  }

  private Object lock = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (lock) {
      while (lock.toString().equals("duh")) lock.wait();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
    }
  }

  private static Object slock = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (slock) {
      while (slock.toString().equals("foobar")) slock.wait();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (slock.toString().equals("foobar")) MismatchedWait.class.wait();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
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
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      ready = true;
      getLock().notifyAll();
    }
    // Mutant addition
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never execute
      System.out.println("This should never print");
    } else {
      // Alternative code that should also never execute
      System.out.println("This should also never print");
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
        // Mutant addition
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some code that should never execute
          System.out.println("This should never print");
        } else {
          // Alternative code that should also never execute
          System.out.println("This should also never print");
        }
      }
    }.run();
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will ensure the condition is always false, making the branches unreachable
  }
}