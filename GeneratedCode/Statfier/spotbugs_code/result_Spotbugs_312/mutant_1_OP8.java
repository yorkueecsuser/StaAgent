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
  }

  public void xxx() {
    Y y = new Y();
    y.run();
  }

  public int greeb() {
    return yarg;
  }

  class Bleem {
    public void gnasp() {
      System.out.println("oog");
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
  }

  public void other(Blat b) {
    b.finalize();
    System.out.println(new Boolean(true));
    b.run();
  }

  @Override
  public void run() {}

  public void badlock() {
    lock = new Object();

    greeb();
    synchronized (lock) {
      makeBleem();
    }

    System.out.println(new String());
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
  }

  public synchronized void setYoom(int y) {
    yoom = y;
  }

  public void gimme(java.io.InputStream in) {
    try {
      byte[] buf = new byte[256];
      in.read(buf);
      System.out.println(new String(buf));
    } catch (java.io.IOException e) {
    }
  }

  public void spin() {
    while (lock == null)
      ;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object next() {
    return null;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  private long serialVersionUID = 11091284L;

  private static Object[] foobar = new Object[1];

  public static Object[] getFoobar() {
    return foobar;
  }

  // Mutated code
  private final int a = 2;

  private final int b;

  private Object c;

  public Blat(int z) {
    b = z;
  }

  private static class D extends Thread {
    @Override
    public void run() {}
  }

  private static class E {
    public void start() {
      System.out.println("Don't report this");
    }
  }

  public Blat() {
    b = 5;
    System.out.println(c);
    new D().start();
    new E().start();
  }

  public void fff() {
    D d = new D();
    d.run();
  }

  public int hhh() {
    return a;
  }

  class F {
    public void ggg() {
      System.out.println("oog");
    }

    @Override
    protected void finalize() {}
  }

  public F makeF() {
    return new F();
  }

  @Override
  public void finalize() {
    System.out.println("This is dumb");
  }

  public void jjj(Blat k) {
    k.finalize();
    System.out.println(new Boolean(true));
    k.run();
  }

  @Override
  public void run() {}

  public void ll() {
    c = new Object();

    hhh();
    synchronized (c) {
      makeF();
    }

    System.out.println(new String());
  }

  private int m;

  public int getM() throws InterruptedException {
    Object n = c;
    synchronized (n) {
      n.notify();
    }

    synchronized (n) {
      n.wait();
    }

    System.out.println(new String("hello"));
    return m;
  }

  public synchronized void setM(int p) {
    m = p;
  }

  public void qqq(java.io.InputStream r) {
    try {
      byte[] s = new byte[256];
      r.read(s);
      System.out.println(new String(s));
    } catch (java.io.IOException e) {
    }
  }

  public void ttt() {
    while (c == null)
      ;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public Object next() {
    return null;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  private long u = 11091284L;

  private static Object[] v = new Object[1];

  public static Object[] getV() {
    return v;
  }
}