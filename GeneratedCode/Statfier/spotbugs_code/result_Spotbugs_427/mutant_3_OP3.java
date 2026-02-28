import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 0;
    }
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public synchronized void incrementX() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = 10;
    }
    x++;
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}