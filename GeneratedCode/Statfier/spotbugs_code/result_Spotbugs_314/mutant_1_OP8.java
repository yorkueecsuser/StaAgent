import java.util.HashMap;
import java.util.Map;

class MismatchedWait {

  private static Map m = new HashMap();

  public void falsePositive(Object o) {
    synchronized (m) {
      m.put(o, o);
      m.notifyAll();
    }
  }

  public void foo(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.wait();
    }
  }

  public void bar(Object a, Object b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
    }
  }

  private Object lock = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (lock) {
      while (lock.toString().equals("duh")) lock.wait();
    }
  }

  private static Object slock = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (slock) {
      while (slock.toString().equals("foobar")) slock.wait();
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (slock.toString().equals("foobar")) MismatchedWait.class.wait();
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
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      ready = true;
      getLock().notifyAll();
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
      }
    }.run();
  }

  // Mutated code
  private static Map x = new HashMap();

  public void falsePositive(z o) {
    synchronized (x) {
      x.put(o, o);
      x.notifyAll();
    }
  }

  public void foo(y a, z b) throws InterruptedException {
    synchronized (a) {
      b.wait();
    }
  }

  public void bar(y a, z b) throws InterruptedException {
    synchronized (a) {
      b.notify();
      b.notifyAll();
    }
  }

  private Object q = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (q) {
      while (q.toString().equals("duh")) q.wait();
    }
  }

  private static Object r = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (r) {
      while (r.toString().equals("foobar")) r.wait();
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (r.toString().equals("foobar")) MismatchedWait.class.wait();
    }
  }

  public static Object getLock() {
    return r;
  }

  static boolean s = false;

  public static void doNotReportMethodCallWait() throws InterruptedException {
    synchronized (getLock()) {
      while (!s) getLock().wait();
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLock()) {
      s = true;
      getLock().notifyAll();
    }
  }

  private int t = 0;

  public void doNotReportInnerClass() {
    new Runnable() {
      @Override
      public void run() {
        synchronized (q) {
          try {
            while (t == 0) q.wait();
          } catch (InterruptedException e) {
          }
        }
      }
    }.run();
  }
}