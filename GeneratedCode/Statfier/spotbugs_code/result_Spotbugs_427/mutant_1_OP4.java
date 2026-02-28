import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that logically should not run
      x = 0;
    } else {
      // Some alternative code that logically should not run
      x = -1;
    }
    return x;
  }

  public void setX(int x) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that logically should not run
      this.x = 0;
    } else {
      // Some alternative code that logically should not run
      this.x = -1;
    }
    this.x = x;
  }

  public synchronized void incrementX() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that logically should not run
      x = 0;
    } else {
      // Some alternative code that logically should not run
      x = -1;
    }
    x++;
  }

  private boolean getCondition() {
    // This method returns a condition that is always false at runtime
    return false;
  }
}