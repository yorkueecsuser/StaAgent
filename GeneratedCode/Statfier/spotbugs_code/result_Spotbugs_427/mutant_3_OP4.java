import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      x = 0;
    } else {
      // This block will always be executed
      return x;
    }
    return x;
  }

  private boolean getCondition() {
    // Always returns false, making the if block unreachable
    return false;
  }

  public void setX(int x) {
    this.x = x;
  }

  public synchronized void incrementX() {
    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      x = -1;
    } else {
      // This block will always be executed
      x++;
    }
  }
}