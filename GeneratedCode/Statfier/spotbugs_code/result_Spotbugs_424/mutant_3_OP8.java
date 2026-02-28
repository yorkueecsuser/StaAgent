import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3368029 {
  // case #0
  @NoWarning("IS")
  private int x;

  public synchronized int getX() {
    return x;
  }

  @NoWarning("IS")
  public void setX(int x) {
    synchronized (this) {
      this.x = x;
    }
  }

  // case #1
  @ExpectWarning("IS")
  private int total;

  public synchronized int getTotal() {
    return total;
  }
  /*missing synchronized!*/
  public void foobar() {
    this.total = 0;
  }
  /*missing synchronized!*/
  public void count(String... things) {
    for (String thing : things) {
      countOne(thing);
    }
  }

  private synchronized void countOne(String thing) {
    total += thing.length();
  }

  // case #2
  @DesireNoWarning("IS")
  private int total2;

  public synchronized int count2(String... things) {
    this.total2 = 0;
    for (final String thing : things) {
      new Runnable() {
        @Override
        public void run() {
          countOne2(thing);
        }
      }.run();
    }
    return total2;
  }

  @DesireNoWarning("IS")
  private void countOne2(String thing) {
    assert Thread.holdsLock(this);
    total2 += thing.length();
  }

  // Mutated code
  // case #0
  @NoWarning("IS")
  private int y;

  public synchronized int getY() {
    return y;
  }

  @NoWarning("IS")
  public void setY(int y) {
    synchronized (this) {
      this.y = y;
    }
  }

  // case #1
  @ExpectWarning("IS")
  private int u;

  public synchronized int getU() {
    return u;
  }
  /*missing synchronized!*/
  public void baz() {
    this.u = 0;
  }
  /*missing synchronized!*/
  public void increment(String... items) {
    for (String item : items) {
      incrementOne(item);
    }
  }

  private synchronized void incrementOne(String item) {
    u += item.length();
  }

  // case #2
  @DesireNoWarning("IS")
  private int v;

  public synchronized int countV(String... items) {
    this.v = 0;
    for (final String item : items) {
      new Runnable() {
        @Override
        public void run() {
          countOneV(item);
        }
      }.run();
    }
    return v;
  }

  @DesireNoWarning("IS")
  private void countOneV(String item) {
    assert Thread.holdsLock(this);
    v += item.length();
  }
}