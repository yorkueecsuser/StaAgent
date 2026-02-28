import java.io.Serializable;

class Blat implements Runnable, java.util.Iterator, Serializable {
  private final int yarg = 2;

  private final int yarm;

  private Object lock;

  public Blat(int y) {
    yarm = y;
  }

  private static class Y extends Thread {
    @Override
    public void run() {}
  }

  private static class NotThread {
    public void start() {
      System.out.println("Don't report this");
    }
  }

  public Blat() {
    yarm = 5;
    System.out.println(lock);
    new Y().start();
    new NotThread().start();

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is unreachable");
    }
  }

  public void xxx() {
    Y y = new Y();
    y.run();

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is also unreachable");
    }
  }

  public int greeb() {
    return yarg;
  }

  class Bleem {
    public void gnasp() {
      System.out.println("oog");

      // Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Yet another unreachable");
      }
    }

    @Override
    protected void finalize() {}
  }

  public Bleem makeBleem() {
    return new Bleem();
  }

  @Override
  public void finalize() {
    System.out.println("This is dumb");

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in finalize");
    }
  }

  public void other(Blat b) {
    b.finalize();
    System.out.println(new Boolean(true));
    b.run();

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in other");
    }
  }

  @Override
  public void run() {
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in run");
    }
  }

  public void badlock() {
    lock = new Object();

    greeb();
    synchronized (lock) {
      makeBleem();
    }

    System.out.println(new String());

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in badlock");
    }
  }

  private int yoom;

  public int getYoom() throws InterruptedException {
    Object x = lock;
    synchronized (x) {
      x.notify();
    }

    synchronized (x) {
      x.wait();
    }

    System.out.println(new String("hello"));
    return yoom;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in getYoom");
    }
  }

  public synchronized void setYoom(int y) {
    yoom = y;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in setYoom");
    }
  }

  public void gimme(java.io.InputStream in) {
    try {
      byte[] buf = new byte[256];
      in.read(buf);
      System.out.println(new String(buf));

      // Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("Unreachable in gimme");
      }
    } catch (java.io.IOException e) {
    }
  }

  public void spin() {
    while (lock == null)
      ;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in spin");
    }
  }

  @Override
  public boolean hasNext() {
    return false;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in hasNext");
    }
  }

  @Override
  public Object next() {
    return null;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in next");
    }
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in remove");
    }
  }

  private long serialVersionUID = 11091284L;

  private static Object[] foobar = new Object[1];

  public static Object[] getFoobar() {
    return foobar;

    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("Unreachable in getFoobar");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}