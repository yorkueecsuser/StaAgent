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
  private final int zarg = 2; // Renamed yarg to zarg

  private final int zam; // Renamed yarm to zam

  private Object kock; // Renamed lock to kock

  public Blat(int z) {
    zam = z;
  }

  public Blat() {
    zam = 5;
    System.out.println(kock);
    new Y().start();
    new NotThread().start();
  }

  public void xxx() {
    Y z = new Y(); // Renamed y to z
    z.run();
  }

  public int greeb() {
    return zarg; // Renamed yarg to zarg
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
    kock = new Object(); // Renamed lock to kock

    greeb(); // Renamed greeb to greeb (no change needed as it's already using zarg)
    synchronized (kock) { // Renamed lock to kock
      makeBleem();
    }

    System.out.println(new String());
  }

  private int zoim; // Renamed yoom to zoim

  public int getZoim() throws InterruptedException { // Renamed getYoom to getZoim
    Object x = kock; // Renamed lock to kock
    synchronized (x) {
      x.notify();
    }

    synchronized (x) {
      x.wait();
    }

    System.out.println(new String("hello"));
    return zoim; // Renamed yoom to zoim
  }

  public synchronized void setZoim(int z) { // Renamed setYoom to setZoim
    zoim = z; // Renamed yoom to zoim
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
    while (kock == null) // Renamed lock to kock
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

  private long serialVersionUId = 11091284L; // Renamed serialVersionUID to serialVersionUId

  private static Object[] foozar = new Object[1]; // Renamed foobar to foozar

  public static Object[] getFoozar() { // Renamed getFoobar to getFoozar
    return foozar; // Renamed foobar to foozar
  }
}