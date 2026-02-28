class Bug1815013 {
  private int x, y;

  public Bug1815013(Bug1815013 p) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
    this(p.x, p.y); // Should be treated as UNSYNC_ACCESS w/r/t p.x and p.y
  }

  public Bug1815013(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
    this.x = x;
    this.y = y;
  }

  public synchronized int[] get() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
    return new int[] {x, y};
  }

  public synchronized void set(int x, int y) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
    this.x = x;
    this.y = y;
  }

  public void set2(Bug1815013 p) {
    synchronized (this) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because getCondition() will never return true
      }
      p.x = y; // should generate warning w/r/t p
    }
  }

  public void set3(Bug1815013 p) {
    synchronized (this) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because getCondition() will never return true
      }
      p.x = get()[0]; // should generate warning w/r/t p
    }
  }

  public void set4(Bug1815013 p) {
    synchronized (p) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because getCondition() will never return true
      }
      p.x = get()[0]; // should not generate warning
    }
  }

  public void set5(Bug1815013 p) {
    synchronized (p) {
      synchronized (this) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
          // This loop is unreachable because getCondition() will never return true
        }
        p.x = y; // should not generate warning
      }
    }
  }

  private void privateUnsynchSetThis(Bug1815013 p) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
    // should be treated as SYNC_ACCESS, and it is
    this.x = p.get()[0];
  }

  public void publicSyncThis(Bug1815013 p) {
    synchronized (this) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because getCondition() will never return true
      }
      privateUnsynchSetThis(p);
    }
  }

  private void privateUnsynchSetP(Bug1815013 p) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { // Unreachable while loop
      // This loop is unreachable because getCondition() will never return true
    }
    // should be treated as SYNC_ACCESS, but is treated as UNSYNC_ACCESS
    p.x = get()[0];
  }

  public void publicSyncP(Bug1815013 p) {
    synchronized (p) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) { // Unreachable while loop
        // This loop is unreachable because getCondition() will never return true
      }
      privateUnsynchSetP(p);
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the while loops unreachable
  }
}