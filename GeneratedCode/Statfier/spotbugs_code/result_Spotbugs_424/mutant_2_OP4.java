import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3368029 {
  // case #0
  @NoWarning("IS")
  private int x;

  public synchronized int getX() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // Unreachable else block
    }
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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // Unreachable else block
    }
    this.total = 0;
  }
  /*missing synchronized!*/
  public void count(String... things) {
    for (String thing : things) {
      countOne(thing);
    }
  }

  private synchronized void countOne(String thing) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // Unreachable else block
    }
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
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // Unreachable if-else statement
          } else {
            // Unreachable else block
          }
          countOne2(thing);
        }
      }.run();
    }
    return total2;
  }

  @DesireNoWarning("IS")
  private void countOne2(String thing) {
    assert Thread.holdsLock(this);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
    } else {
      // Unreachable else block
    }
    total2 += thing.length();
  }

  private boolean getCondition() {
    return false; // This method returns false, but it is not a compile-time constant
  }
}