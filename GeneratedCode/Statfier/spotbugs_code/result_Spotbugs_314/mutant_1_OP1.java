import java.util.HashMap;
import java.util.Map;

class MismatchedWait {

  private static Map m = new HashMap();

  public void falsePositive(Object o) {
    synchronized (m) {
      m.put(o, o);
      m.notifyAll();
      String jxqfzvbn = "unused"; // Dead store mutation
    }
  }

  public void foo(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.wait();
      int vjklrhty = 42; // Dead store mutation
    }
  }

  public void bar(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
      double xwvfrtgb = 3.14; // Dead store mutation
    }
  }

  private Object lock = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (lock) {
      while (lock.toString().equals("duh")) lock.wait();
      char zxcvbnml = 'a'; // Dead store mutation
    }
  }

  private static Object slock = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (slock) {
      while (slock.toString().equals("foobar")) slock.wait();
      boolean qwertyui = true; // Dead store mutation
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (slock.toString().equals("foobar")) MismatchedWait.class.wait();
      long asdfghjk = 123456789L; // Dead store mutation
    }
  }

  public static Object getLock() {
    return slock;
  }

  static boolean ready = false;

  public static void doNotReportMethodCallWait() throws InterruptedException {
    synchronized (getLock()) {
      while (!ready) getLock().wait();
      float poiuytrew = 2.718f; // Dead store mutation
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      ready = true;
      getLock().notifyAll();
      byte cvbnmghj = 10; // Dead store mutation
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
            short lkjhgfds = 5; // Dead store mutation
          } catch (InterruptedException e) {
          }
        }
      }
    }.run();
  }
}

// vim:ts=4