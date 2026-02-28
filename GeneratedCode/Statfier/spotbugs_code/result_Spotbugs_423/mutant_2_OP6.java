class Bug1815013 {
  private int x, y;

  public Bug1815013(Bug1815013 p) {
    this(p.x, p.y); // Should be treated as UNSYNC_ACCESS w/r/t p.x and p.y
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  public Bug1815013(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public synchronized int[] get() {
    return new int[] {x, y};
  }

  public synchronized void set(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void set2(Bug1815013 p) {
    synchronized (this) {
      p.x = y; // should generate warning w/r/t p
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  public void set3(Bug1815013 p) {
    synchronized (this) {
      p.x = get()[0]; // should generate warning w/r/t p
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  public void set4(Bug1815013 p) {
    synchronized (p) {
      p.x = get()[0]; // should not generate warning
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  public void set5(Bug1815013 p) {
    synchronized (p) {
      synchronized (this) {
        p.x = y; // should not generate warning
      }
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  private void privateUnsynchSetThis(Bug1815013 p) {
    // should be treated as SYNC_ACCESS, and it is
    this.x = p.get()[0];
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  public void publicSyncThis(Bug1815013 p) {
    synchronized (this) {
      privateUnsynchSetThis(p);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  private void privateUnsynchSetP(Bug1815013 p) {
    // should be treated as SYNC_ACCESS, but is treated as UNSYNC_ACCESS
    p.x = get()[0];
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  public void publicSyncP(Bug1815013 p) {
    synchronized (p) {
      privateUnsynchSetP(p);
    }
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because conditionFor is dynamically determined and should be false at runtime
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined and false at runtime
  }
}