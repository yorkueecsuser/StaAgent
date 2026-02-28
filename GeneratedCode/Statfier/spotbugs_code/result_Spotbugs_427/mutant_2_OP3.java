import edu.umd.cs.findbugs.annotations.ExpectWarning;

class InconsistentSynchronization {
  @ExpectWarning("IS2_INCONSISTENT_SYNC")
  int x;

  public synchronized int getX() {
    // Inserting unreachable if statement
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
    // Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = -1;
    }
    x++;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}