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

  // Mutant code
  private static Map x = new HashMap();

  public void falsePositive(Object q) {
    synchronized (x) {
      x.put(q, q);
      x.notifyAll();
    }
  }

  public void foo(Object c, Object d) throws InterruptedException {
    synchronized (c) {
      d.wait();
    }
  }

  public void bar(Object e, Object f) throws InterruptedException {
    synchronized (e) {
      f.notify();
      f.notifyAll();
    }
  }

  private Object y = new Object();

  public void doNotReport() throws InterruptedException {
    synchronized (y) {
      while (y.toString().equals("duh")) y.wait();
    }
  }

  private static Object z = new Object();

  public static void doNotReportStatic() throws InterruptedException {
    synchronized (z) {
      while (z.toString().equals("foobar")) z.wait();
    }
  }

  public static void doNotReportClassRef() throws InterruptedException {
    synchronized (MismatchedWait.class) {
      while (z.toString().equals("foobar")) MismatchedWait.class.wait();
    }
  }

  public static Object getLockMutant() {
    return z;
  }

  static boolean g = false;

  public static void doNotReportMethodCallWait() throws InterruptedException {
    synchronized (getLockMutant()) {
      while (!g) getLockMutant().wait();
    }
  }

  public static void doNotReportMethodCallNotifyAll() throws InterruptedException {
    synchronized (getLockMutant()) {
      g = true;
      getLockMutant().notifyAll();
    }
  }

  private int h = 0;

  public void doNotReportInnerClass() {
    new Runnable() {
      @Override
      public void run() {
        synchronized (y) {
          try {
            while (h == 0) y.wait();
          } catch (InterruptedException e) {
          }
        }
      }
    }.run();
  }
}